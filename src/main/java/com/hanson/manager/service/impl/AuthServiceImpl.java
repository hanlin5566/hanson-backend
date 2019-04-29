package com.hanson.manager.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hanson.base.enums.DataStatus;
import com.hanson.base.exception.ControllerException;
import com.hanson.base.exception.ServiceException;
import com.hanson.base.response.ResponseCode;
import com.hanson.base.util.BeanUtils;
import com.hanson.manager.dao.gen.entity.SystemUser;
import com.hanson.manager.dao.gen.entity.SystemUserExample;
import com.hanson.manager.dao.gen.mapper.SystemUserMapper;
import com.hanson.manager.enums.ManagerResponseCode;
import com.hanson.manager.service.AuthService;
import com.hanson.manager.util.JWTUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Create by hanlin on 2018年5月24日
 **/
@Service
public class AuthServiceImpl implements AuthService {
	@Autowired
	SystemUserMapper userDAO;

	@Autowired
	JWTUtils jwtUtils;

	@Autowired
	private RedisTemplate redisTemplate;

	private final String TOKEN_KEY = "token";
	//模拟redis
	private Map<String,String> tokenMap = new HashMap<>();


	public String login(SystemUser user){
		SystemUserExample example = new SystemUserExample();
		example.createCriteria().andUserNameEqualTo(user.getUserName()).andDataStatusEqualTo(DataStatus.NORMAL);
		List<SystemUser> result = userDAO.selectByExample(example);
		if(result.size() == 0){
			throw new ServiceException(ManagerResponseCode.USER_NOT_FOUND);
		}
		SystemUser systemUser = result.get(0);
		String userPwd = systemUser.getUserPwd();
		String slat = systemUser.getUserSalt();
		//匹配加密后的密码
		if(!userPwd.equals(DigestUtils.sha1Hex(user.getUserPwd() + slat))){
			//密码错误
			throw new ServiceException(ManagerResponseCode.USER_PWD_ERROR);
		}
		//设置token
		//TODO:本次登录的唯一ID
		String tokenId = UUID.randomUUID().toString();
		JSONObject subject = new JSONObject();
		subject.put("userId",systemUser.getId());
		subject.put("nikeName",systemUser.getNikeName());
		String token = jwtUtils.createJWT(tokenId, subject.toJSONString());
//		redisTemplate.opsForValue().set(TOKEN_KEY + tokenId, systemUser, 5, TimeUnit.HOURS);
		tokenMap.put(TOKEN_KEY + tokenId,token);
		return tokenId;
	}

	@Override
	public void logout() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		String tokenId = request.getHeader("Hanson-Token");
//		redisTemplate.delete(TOKEN_KEY + tokenId);
		tokenMap.remove(TOKEN_KEY + tokenId);
	}

	@Override
	public Integer register(SystemUser user) {
		SystemUserExample example = new SystemUserExample();
		example.createCriteria().andUserNameEqualTo(user.getUserName()).andDataStatusEqualTo(DataStatus.NORMAL);
		List<SystemUser> result = userDAO.selectByExample(example);
		//用户名重复
		if(result.size() > 0){
			throw new ServiceException(ManagerResponseCode.USER_NAME_DUPLICATE);
		}
		//加盐
		String slat = UUID.randomUUID().toString().replace("-","");
		String password = DigestUtils.sha1Hex(user.getUserPwd() + slat);
		//加密赋值
		user.setUserSalt(slat);
		user.setUserPwd(password);
		user.setDataStatus(DataStatus.NORMAL);
		userDAO.insertSelective(user);
		return user.getId();
	}
	/**
	 *
	 * 功能描述:
	 *	返回用户信息以及权限,并且前端
	 *roles: ['admin'],
	 *     introduction: 'I am a super administrator',
	 *     avatar: 'https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif',
	 *     name: 'Super Admin'
	 * @param:
	 * @return:
	 * @auther: Hanson
	 * @date: 2019/4/16 17:07
	 */
	@Override
	public JSONObject getUserInfo() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		String tokenId = request.getHeader("Hanson-Token");
		try {
			if(!tokenMap.containsKey(TOKEN_KEY + tokenId)){
				throw new ControllerException(ResponseCode.UNAUTHORIZED);
			}
			String token = tokenMap.get(TOKEN_KEY + tokenId);
			Claims claims = jwtUtils.parseJWT(token);
			//TODO:无异常则能获取到token中的内容作出相应逻辑，并跳转
			JSONObject userInfo = JSONObject.parseObject(claims.getSubject());
			Integer userId = userInfo.getInteger("userId");
			String nikeName = userInfo.getString("nikeName");
			JSONObject ret = new JSONObject();
			ret.put("name",nikeName);
			ret.put("introduction","I am "+nikeName);
			ret.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
			List<String> roleList = new ArrayList<String>();
			roleList.add("admin");
			ret.put("roles",roleList);
//			ret.put("menus",userService.getUserMenus(user.getUserId()));
//			ret.put("channels",user.getChannels());
//			ret.put("decisions",user.getDecisions());
			return ret;
		}catch (ExpiredJwtException e) {
			// 在解析JWT字符串时，如果‘过期时间字段’已经早于当前时间，将会抛出ExpiredJwtException异常，说明本次请求已经失效
			throw new ControllerException(ResponseCode.UNAUTHORIZED);
		}
//        catch (Signatrue e) {
//            // 在解析JWT字符串时，如果密钥不正确，将会解析失败，抛出SignatureException异常，说明该JWT字符串是伪造的
//            throw new ControllerException(ResponseCode.UNAUTHORIZED);
//        }
		catch (Exception e) {
			throw new ControllerException(ResponseCode.UNAUTHORIZED,e);
		}
	}

}

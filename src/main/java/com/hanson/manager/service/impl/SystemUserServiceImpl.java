package com.hanson.manager.service.impl;

import java.util.List;

import com.hanson.base.util.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanson.base.enums.DataStatus;
import com.hanson.base.mybatis.pagination.entity.PageInfo;
import com.hanson.manager.dao.gen.entity.SystemUser;
import com.hanson.manager.dao.gen.entity.SystemUserExample;
import com.hanson.manager.dao.gen.mapper.SystemUserMapper;
import com.hanson.manager.service.SystemUserService;

/**
 * Create by hanlin on 2019年1月30日
 **/
@Service
public class SystemUserServiceImpl implements SystemUserService{
	@Autowired
	SystemUserMapper mapper;
	
	@Override
	public Integer insert(SystemUser systemUser) {
		return mapper.insertSelective(systemUser);
	}
	@Override
	public Integer delete(Integer id) {
		SystemUser systemUser = new SystemUser();
		systemUser.setId(id);
		systemUser.setDataStatus(DataStatus.DELETED);
		return mapper.updateByPrimaryKeySelective(systemUser);
	}
	@Override
	public Integer update(SystemUser systemUser) {
		return mapper.updateByPrimaryKeySelective(systemUser);
	}
	
	@Override
	public SystemUser get(Integer id) {
		SystemUserExample example = new SystemUserExample();
		example.createCriteria().andDataStatusEqualTo(DataStatus.NORMAL).andIdEqualTo(id);
		List<SystemUser> selectByExample = mapper.selectByExample(example);
		return selectByExample.size() > 0 ? selectByExample.get(0) : null;
	}
	
	@Override
	public List<SystemUser> search(SystemUser systemUser, PageInfo page) {
		SystemUserExample example = BeanUtils.example(systemUser,SystemUserExample.class);
		example.setOrderByClause("id desc");
		List<SystemUser> selectByExample = mapper.selectByExampleWithRowbounds(example, page);
		return selectByExample;
	}
}
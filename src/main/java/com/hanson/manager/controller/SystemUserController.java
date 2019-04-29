package com.hanson.manager.controller;


import java.util.List;

import com.hanson.base.exception.ControllerException;
import com.hanson.base.response.ResponseCode;
import com.hanson.base.response.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanson.base.mybatis.pagination.entity.PageInfo;
import com.hanson.manager.dao.gen.entity.SystemUser;
import com.hanson.manager.service.SystemUserService;
/**
 * Create by hanlin on 2019年1月28日
 **/
@RestController()
@RequestMapping(value = "/systemUsers")
public class SystemUserController {
	@Autowired
	SystemUserService systemUserService;
	/**
	 * 根据ID查找用户
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public ResponseData get(@PathVariable Integer id){
		SystemUser systemUser = systemUserService.get(id);
		if(systemUser == null){
			return ResponseData.fail(ResponseCode.RESOURCE_NOT_FOUND);
		}
		return ResponseData.ok(systemUser);
	}
	/**
	 * 复杂条件查询 查询条件为body中的json
	 * @param systemUser
	 * @return
	 */
	@GetMapping()
	public ResponseData search(@RequestBody SystemUser systemUser,PageInfo page){
		List<SystemUser> list = systemUserService.search(systemUser,page);
		if(list == null){
			return ResponseData.fail(ResponseCode.RESOURCE_NOT_FOUND);
		}
		return ResponseData.ok(list).appendPageInfo(page);
	}
	/**
	 * 新增
	 * @param systemUser
	 * @return
	 */
	@PostMapping()
	public ResponseData add(@RequestBody SystemUser systemUser){
		Integer id = systemUserService.insert(systemUser);
		return ResponseData.ok(id);
	}
	/**
	 * 修改信息
	 * @param systemUser
	 * @return
	 */
	@PutMapping()
	public ResponseData update(@RequestBody SystemUser systemUser){
		Integer id = systemUser.getId();
		if(id == null || id < 0) {
			throw new ControllerException(ResponseCode.ERROR_PARAM);
		}
		Integer count = systemUserService.update(systemUser);
		return ResponseData.ok(count);
	}
	
	/**
	 * 删除信息
	 * @param systemUser
	 * @return
	 */
	@DeleteMapping("/{id}")
	public ResponseData delete(@PathVariable Integer id){
		Integer count = systemUserService.delete(id);
		return ResponseData.ok(count);
	}
}

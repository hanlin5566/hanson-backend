package com.hanson.manager.controller;


import java.util.List;

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
import com.hanson.manager.dao.gen.entity.SYFCCommunity;
import com.hanson.manager.service.SYFCCommunityService;
import com.hanson.base.exception.ControllerException;
//TODO:需要换成自己的responseCode
import com.hanson.base.response.ResponseCode;
import com.hanson.base.response.ResponseData;

/**
 * Create by hanlin on 2019年1月28日
 **/
@RestController()
@RequestMapping(value = "/communitys")
public class SYFCCommunityController {
	@Autowired
	SYFCCommunityService sYFCCommunityService;
	/**
	 * 根据ID查找用户
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public ResponseData get(@PathVariable Integer id){
		SYFCCommunity sYFCCommunity = sYFCCommunityService.get(id);
		if(sYFCCommunity == null){
			return ResponseData.fail(ResponseCode.RESOURCE_NOT_FOUND);
		}
		return ResponseData.ok(sYFCCommunity);
	}
	/**
	 * 复杂条件查询 查询条件为body中的json
	 * @param sYFCCommunity
	 * @return
	 */
	@GetMapping()
	public ResponseData search(SYFCCommunity sYFCCommunity,PageInfo page){
		List<SYFCCommunity> list = sYFCCommunityService.search(sYFCCommunity,page);
		if(list == null){
			return ResponseData.fail(ResponseCode.RESOURCE_NOT_FOUND);
		}
		return ResponseData.ok(list).appendPageInfo(page);
	}
	/**
	 * 新增
	 * @param sYFCCommunity
	 * @return
	 */
	@PostMapping()
	public ResponseData add(@RequestBody SYFCCommunity sYFCCommunity){
		Integer id = sYFCCommunityService.insert(sYFCCommunity);
		return ResponseData.ok(id);
	}
	/**
	 * 修改信息
	 * @param sYFCCommunity
	 * @return
	 */
	@PutMapping()
	public ResponseData update(@RequestBody SYFCCommunity sYFCCommunity){
		Integer id = sYFCCommunity.getId();
		if(id == null || id < 0) {
			throw new ControllerException(ResponseCode.ERROR_PARAM);
		}
		Integer count = sYFCCommunityService.update(sYFCCommunity);
		return ResponseData.ok(count);
	}
	
	/**
	 * 删除信息
	 * @param sYFCCommunity
	 * @return
	 */
	@DeleteMapping("/{id}")
	public ResponseData delete(@PathVariable Integer id){
		Integer count = sYFCCommunityService.delete(id);
		return ResponseData.ok(count);
	}
}

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
import com.hanson.manager.dao.gen.entity.SYFCBuilding;
import com.hanson.manager.service.SYFCBuildingService;
import com.hanson.base.exception.ControllerException;
//TODO:需要换成自己的responseCode
import com.hanson.base.response.ResponseCode;
import com.hanson.base.response.ResponseData;

/**
 * Create by hanlin on 2019年1月28日
 **/
@RestController()
@RequestMapping(value = "/buildings")
public class SYFCBuildingController {
	@Autowired
	SYFCBuildingService sYFCBuildingService;
	/**
	 * 根据ID查找用户
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public ResponseData get(@PathVariable Integer id){
		SYFCBuilding sYFCBuilding = sYFCBuildingService.get(id);
		if(sYFCBuilding == null){
			return ResponseData.fail(ResponseCode.RESOURCE_NOT_FOUND);
		}
		return ResponseData.ok(sYFCBuilding);
	}
	/**
	 * 复杂条件查询 查询条件为body中的json
	 * @param sYFCBuilding
	 * @return
	 */
	@GetMapping()
	public ResponseData search(SYFCBuilding sYFCBuilding,PageInfo page){
		List<SYFCBuilding> list = sYFCBuildingService.search(sYFCBuilding,page);
		if(list == null){
			return ResponseData.fail(ResponseCode.RESOURCE_NOT_FOUND);
		}
		return ResponseData.ok(list).appendPageInfo(page);
	}
	/**
	 * 新增
	 * @param sYFCBuilding
	 * @return
	 */
	@PostMapping()
	public ResponseData add(@RequestBody SYFCBuilding sYFCBuilding){
		Integer id = sYFCBuildingService.insert(sYFCBuilding);
		return ResponseData.ok(id);
	}
	/**
	 * 修改信息
	 * @param sYFCBuilding
	 * @return
	 */
	@PutMapping()
	public ResponseData update(@RequestBody SYFCBuilding sYFCBuilding){
		Integer id = sYFCBuilding.getId();
		if(id == null || id < 0) {
			throw new ControllerException(ResponseCode.ERROR_PARAM);
		}
		Integer count = sYFCBuildingService.update(sYFCBuilding);
		return ResponseData.ok(count);
	}
	
	/**
	 * 删除信息
	 * @param sYFCBuilding
	 * @return
	 */
	@DeleteMapping("/{id}")
	public ResponseData delete(@PathVariable Integer id){
		Integer count = sYFCBuildingService.delete(id);
		return ResponseData.ok(count);
	}
}

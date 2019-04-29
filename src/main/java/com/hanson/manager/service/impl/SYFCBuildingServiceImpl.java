package com.hanson.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanson.base.enums.DataStatus;
import com.hanson.base.mybatis.pagination.entity.PageInfo;
import com.hanson.manager.dao.gen.entity.SYFCBuilding;
import com.hanson.manager.dao.gen.entity.SYFCBuildingExample;
import com.hanson.manager.dao.gen.mapper.SYFCBuildingMapper;
import com.hanson.manager.service.SYFCBuildingService;
import com.hanson.base.util.BeanUtils;

/**
 * Create by hanlin on 2019年1月30日
 **/
@Service
public class SYFCBuildingServiceImpl implements SYFCBuildingService{
	@Autowired
	SYFCBuildingMapper mapper;
	
	@Override
	public Integer insert(SYFCBuilding sYFCBuilding) {
		return mapper.insertSelective(sYFCBuilding);
	}
	@Override
	public Integer delete(Integer id) {
		SYFCBuilding sYFCBuilding = new SYFCBuilding();
		sYFCBuilding.setId(id);
		sYFCBuilding.setDataStatus(DataStatus.DELETED);
		return mapper.updateByPrimaryKeySelective(sYFCBuilding);
	}
	@Override
	public Integer update(SYFCBuilding sYFCBuilding) {
		return mapper.updateByPrimaryKeySelective(sYFCBuilding);
	}
	
	@Override
	public SYFCBuilding get(Integer id) {
		SYFCBuildingExample example = new SYFCBuildingExample();
		example.createCriteria().andDataStatusEqualTo(DataStatus.NORMAL).andIdEqualTo(id);
		List<SYFCBuilding> selectByExample = mapper.selectByExample(example);
		return selectByExample.size() > 0 ? selectByExample.get(0) : null;
	}
	
	@Override
	public List<SYFCBuilding> search(SYFCBuilding sYFCBuilding, PageInfo page) {
		SYFCBuildingExample example = BeanUtils.example(sYFCBuilding,SYFCBuildingExample.class);
		example.setOrderByClause("id desc");
		List<SYFCBuilding> selectByExample = mapper.selectByExampleWithRowbounds(example, page);
		return selectByExample;
	}
}
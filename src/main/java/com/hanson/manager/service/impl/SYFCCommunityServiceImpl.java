package com.hanson.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanson.base.enums.DataStatus;
import com.hanson.base.mybatis.pagination.entity.PageInfo;
import com.hanson.manager.dao.gen.entity.SYFCCommunity;
import com.hanson.manager.dao.gen.entity.SYFCCommunityExample;
import com.hanson.manager.dao.gen.mapper.SYFCCommunityMapper;
import com.hanson.manager.service.SYFCCommunityService;
import com.hanson.base.util.BeanUtils;

/**
 * Create by hanlin on 2019年1月30日
 **/
@Service
public class SYFCCommunityServiceImpl implements SYFCCommunityService{
	@Autowired
	SYFCCommunityMapper mapper;
	
	@Override
	public Integer insert(SYFCCommunity sYFCCommunity) {
		return mapper.insertSelective(sYFCCommunity);
	}
	@Override
	public Integer delete(Integer id) {
		SYFCCommunity sYFCCommunity = new SYFCCommunity();
		sYFCCommunity.setId(id);
		sYFCCommunity.setDataStatus(DataStatus.DELETED);
		return mapper.updateByPrimaryKeySelective(sYFCCommunity);
	}
	@Override
	public Integer update(SYFCCommunity sYFCCommunity) {
		return mapper.updateByPrimaryKeySelective(sYFCCommunity);
	}
	
	@Override
	public SYFCCommunity get(Integer id) {
		SYFCCommunityExample example = new SYFCCommunityExample();
		example.createCriteria().andDataStatusEqualTo(DataStatus.NORMAL).andIdEqualTo(id);
		List<SYFCCommunity> selectByExample = mapper.selectByExample(example);
		return selectByExample.size() > 0 ? selectByExample.get(0) : null;
	}
	
	@Override
	public List<SYFCCommunity> search(SYFCCommunity sYFCCommunity, PageInfo page) {
		SYFCCommunityExample example = BeanUtils.example(sYFCCommunity,SYFCCommunityExample.class);
		example.or(example.createCriteria().andDataStatusEqualTo(DataStatus.NORMAL));
		example.setOrderByClause("sales_date desc");
		List<SYFCCommunity> selectByExample = mapper.selectByExampleWithRowbounds(example, page);
		return selectByExample;
	}
}
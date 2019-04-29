package com.hanson.manager.service;

import java.util.List;

import com.hanson.base.mybatis.pagination.entity.PageInfo;
import com.hanson.manager.dao.gen.entity.SYFCCommunity;

/**
 * Create by hanlin on 2019年1月28日
 **/
public interface SYFCCommunityService {
	/**
	 * 新增一条数据
	 * @param {@link SYFCCommunity} sYFCCommunity
	 * @return
	 */
	public Integer insert(SYFCCommunity sYFCCommunity);
	/**
	 * 删除一条数据
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
	/**
	 * 修改一条数据
	 * @param {@link SYFCCommunity} sYFCCommunity
	 * @return
	 */
	public Integer update(SYFCCommunity sYFCCommunity);
	/**
	 * 根据主键获取一条未被删除的数据
	 * @param id
	 * @return
	 */
	public SYFCCommunity get(Integer id);
	/**
	 * 根据条件检索数据
	 * @param {@link User}
	 * @param {@link PageInfo}
	 * @return
	 */
	public List<SYFCCommunity> search(SYFCCommunity sYFCCommunity,PageInfo page);
}
package com.hanson.manager.service;

import java.util.List;

import com.hanson.base.mybatis.pagination.entity.PageInfo;
import com.hanson.manager.dao.gen.entity.SYFCBuilding;

/**
 * Create by hanlin on 2019年1月28日
 **/
public interface SYFCBuildingService {
	/**
	 * 新增一条数据
	 * @param {@link SYFCBuilding} sYFCBuilding
	 * @return
	 */
	public Integer insert(SYFCBuilding sYFCBuilding);
	/**
	 * 删除一条数据
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
	/**
	 * 修改一条数据
	 * @param {@link SYFCBuilding} sYFCBuilding
	 * @return
	 */
	public Integer update(SYFCBuilding sYFCBuilding);
	/**
	 * 根据主键获取一条未被删除的数据
	 * @param id
	 * @return
	 */
	public SYFCBuilding get(Integer id);
	/**
	 * 根据条件检索数据
	 * @param {@link User}
	 * @param {@link PageInfo}
	 * @return
	 */
	public List<SYFCBuilding> search(SYFCBuilding sYFCBuilding,PageInfo page);
}
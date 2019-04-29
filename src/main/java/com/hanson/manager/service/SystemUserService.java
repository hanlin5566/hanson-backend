package com.hanson.manager.service;

import java.util.List;

import com.hanson.base.mybatis.pagination.entity.PageInfo;
import com.hanson.manager.dao.gen.entity.SystemUser;

/**
 * Create by hanlin on 2019年1月28日
 **/
public interface SystemUserService {
	/**
	 * 新增一条数据
	 * @param {@link SystemUser} systemUser
	 * @return
	 */
	public Integer insert(SystemUser systemUser);
	/**
	 * 删除一条数据
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
	/**
	 * 修改一条数据
	 * @param {@link SystemUser} systemUser
	 * @return
	 */
	public Integer update(SystemUser systemUser);
	/**
	 * 根据主键获取一条未被删除的数据
	 * @param id
	 * @return
	 */
	public SystemUser get(Integer id);
	/**
	 * 根据条件检索数据
	 * @param {@link User}
	 * @param {@link PageInfo}
	 * @return
	 */
	public List<SystemUser> search(SystemUser systemUser,PageInfo page);
}
package com.hanson.manager.service;

import com.alibaba.fastjson.JSONObject;
import com.hanson.manager.dao.gen.entity.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by hanlin on 2018年5月24日
 **/
@Service
public interface AuthService {
	public String login(SystemUser user);
	public void logout();
	public Integer register(SystemUser user);
	public JSONObject getUserInfo();
}

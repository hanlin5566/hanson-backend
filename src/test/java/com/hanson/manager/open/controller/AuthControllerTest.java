package com.hanson.manager.open.controller;

import com.hanson.manager.ManagerApplication;
import com.hanson.manager.dao.gen.entity.SystemUser;
import com.hanson.manager.enums.Gender;
import com.hanson.manager.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Date;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ManagerApplication.class)
@WebAppConfiguration

@Slf4j
public class AuthControllerTest {

    MockMvc mock;

    @Autowired
    WebApplicationContext webApplicationConnect;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private AuthService authService;

    @Before
    public void setUp()  {
        mock = MockMvcBuilders.webAppContextSetup(webApplicationConnect).build();
    }

    @Test
    public void registerUser() {
        //模拟用户注册
        SystemUser systemUser = new SystemUser();
        systemUser.setUserName("admin");
        systemUser.setUserPwd("admin");
        systemUser.setApiName("hanson");
        systemUser.setApiPwd("hanson");
        systemUser.setNikeName("super-hero");
        systemUser.setGender(Gender.MALE);
        systemUser.setDeptId("1");
        systemUser.setUserEmail("admin@admin.com");
        systemUser.setUserTel("13000000000");
        systemUser.setCreateTime(new Date());
        systemUser.setUpdateTime(new Date());
        systemUser.setCreateUid(1);
        systemUser.setUpdateUid(1);
        systemUser.setCompanyCode("1000010");
        Integer userId = authService.register(systemUser);
        log.debug("userid:{}",userId);
    }
}
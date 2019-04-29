package com.hanson.manager.controller.open;

import com.alibaba.fastjson.JSONObject;
import com.hanson.base.exception.ControllerException;
import com.hanson.base.response.ResponseData;
import com.hanson.manager.dao.gen.entity.SystemUser;
import com.hanson.manager.enums.ManagerResponseCode;
import com.hanson.manager.service.AuthService;
import com.hanson.manager.util.JWTUtils;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/auth")
@Slf4j
public class AuthController {
    @Autowired
    private AuthService authService;

    @Autowired
    private JWTUtils jwtUtils;
    //模拟redis
    Map<String,String> tokenMap = new HashMap<String,String>();

    @PostMapping("/login")
    public ResponseData login(@RequestBody JSONObject param){
        String userName = param.getString("username");
        String password = param.getString("password");
        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)){
            throw new ControllerException(ManagerResponseCode.PARAM_ERROR);
        }
        SystemUser systemUser = new SystemUser();
        systemUser.setUserName(userName);
        systemUser.setUserPwd(password);
        String token = authService.login(systemUser);
        JSONObject ret = new JSONObject();
        ret.put("token",token);
        return ResponseData.ok(ret);
    }

    @PostMapping("/logout")
    public ResponseData logout(){
        authService.logout();
        return ResponseData.ok();
    }

    @GetMapping("/info")
    public ResponseData userInfo(){
        JSONObject userInfo = authService.getUserInfo();
        return ResponseData.ok(userInfo);
    }
}

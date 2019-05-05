package com.hanson.manager.component;

import com.alibaba.fastjson.JSONObject;
import com.hanson.manager.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 *
 * 功能描述:
 *	鉴权
 * @param:
 * @return:
 * @auther: Hanson
 * @date: 2019/4/16 15:29
 */
@Aspect
@Component
@Slf4j
public class AddUidByLoginUserAspect {
    @Autowired
    AuthService authService;

    /* post用於添加*/
    @Pointcut("execution(* com.hanson.manager.controller.*.*(..)) && @annotation(org.springframework.web.bind.annotation.PostMapping)")
    public void addCreateUidPonitCut() {
    }
    /*put用於修改*/
//    @Pointcut("execution(* com.hanson.manager.controller.*(..))) && @annotation(org.springframework.web.bind.annotation.PutMapping)")
//    public void addUpdateUidPointCut() {
//    }

    @Around("addCreateUidPonitCut()")
    public Object addCreateUid(ProceedingJoinPoint joinPoint) throws Throwable {
        JSONObject userInfo = authService.getUserInfo();
        Integer userId = userInfo.getInteger("userId");
        Object arg = joinPoint.getArgs()[0];
        Method setCreateUserId = arg.getClass().getMethod("setCreateUserId",Integer.class);
        setCreateUserId.invoke(arg,userId);

        Method setUpdateUserId = arg.getClass().getMethod("setUpdateUserId", Integer.class);
        setUpdateUserId.invoke(arg,userId);
        return joinPoint.proceed();
    }

//    @Around("addUpdateUidPointCut()")
//    public Object addUpdateUid(ProceedingJoinPoint joinPoint) throws Throwable {
//        String updateUserId = "updateUserId";
//        return joinPoint.proceed();
//    }
}

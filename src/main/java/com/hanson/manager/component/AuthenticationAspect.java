//package com.hanson.manager.component;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Arrays;
//import java.util.List;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.hanson.base.exception.ControllerException;
//import com.hanson.base.response.ResponseCode;
//import com.hanson.base.response.ResponseData;
//import com.hanson.manager.util.JWTUtils;
//import io.jsonwebtoken.ExpiredJwtException;
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//
//
//import io.jsonwebtoken.Claims;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
///**
// *
// * 功能描述:
// *	鉴权,目前由页面请求getinfo，进行鉴权。
// * @param:
// * @return:
// * @auther: Hanson
// * @date: 2019/4/16 15:29
// */
//@Aspect
//@Component
//@Slf4j
//public class AuthenticationAspect {
//
//    @Pointcut("(execution(* com.hanson.manager.controller..*(..))) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
//    public void authAspect() {
//    }
//	@Autowired
//	private JWTUtils jwtUtils;
//
//	@Value("${hj.secrity.disable}")
//	public boolean disable;
//
//    @Around("authAspect()") // 指定拦截器规则；也可以直接把"execution(*// com.……)"写进这里
//    public Object Interceptor(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest httpRequest = attributes.getRequest();
//        HttpServletResponse httpResponse = attributes.getResponse();
//        String token = httpRequest.getHeader("Hanson-Token");
//        String uri = httpRequest.getRequestURI();
//        Object result = null;
//        //验证TOKEN
//        if (StringUtils.isEmpty(token)) {
//            PrintWriter print = httpResponse.getWriter();
//            print.write(ResponseData.failByUnauthorized().toString());
//            throw new ControllerException(ResponseCode.UNAUTHORIZED);
//        }
//        try {
//            Claims claims = jwtUtils.parseJWT(token);
//            //TODO:无异常则能获取到token中的内容作出相应逻辑，并跳转
//            claims.getSubject();
//			String uid = claims.get("uid",String.class);
//        }catch (ExpiredJwtException e) {
//            // 在解析JWT字符串时，如果‘过期时间字段’已经早于当前时间，将会抛出ExpiredJwtException异常，说明本次请求已经失效
//            throw new ControllerException(ResponseCode.UNAUTHORIZED);
//        }
////        catch (Signatrue e) {
////            // 在解析JWT字符串时，如果密钥不正确，将会解析失败，抛出SignatureException异常，说明该JWT字符串是伪造的
////            throw new ControllerException(ResponseCode.UNAUTHORIZED);
////        }
//        catch (Exception e) {
//            throw new ControllerException(ResponseCode.UNAUTHORIZED,e);
//        }
//        result = joinPoint.proceed();
//        return result;
//    }
//
//
//    /**
//     * 使用@AfterThrowing 用来处理当切入内容部分抛出异常之后的处理逻辑。
//     * @param joinPoint
//     */
//    @AfterThrowing(pointcut = "authAspect()",throwing = "e")
//    public void doAfterThrowing(JoinPoint joinPoint, Throwable e) {
//        log.error("@doAfterThrowing",e);
//    }
//
//}

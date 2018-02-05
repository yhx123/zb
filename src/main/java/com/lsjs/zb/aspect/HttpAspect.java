package com.lsjs.zb.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * HTTP AOP
 *
 * @author sifu
 * @version 1.0.0
 */
@Slf4j
@Aspect
@Component
public class HttpAspect {


    @Pointcut(value = "execution(public * com.lsjs.zb.controller.*.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // url
        log.debug("url={}", request.getRequestURL());
        // port
        log.debug("port={}", request.getRemotePort());
        // method
        log.debug("method={}", request.getMethod());
        // ip
        log.debug("ip={}", request.getRemoteAddr());
        // class_method
        log.debug("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        // 参数
        log.debug("args={}", Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        log.info("response={}", object);
    }

}

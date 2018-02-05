package com.lsjs.zb.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 杨红星
 * @version 1.0.0
 */
@Component
@Aspect
@Slf4j
public class ServiceAspect {
    /**
     * 日志切入点
     */
    @Pointcut("execution(* com.lsjs.zb.service.*.*.*(..))")
    private void logPointcut() {
    }
    @Before("logPointcut()")
    public void beforeLog(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        log.debug("{}的执行了{}",className, methodName);

        Object[] args = joinPoint.getArgs();
        StringBuilder params = new StringBuilder("请求参数:");
        for (Object arg : args) {
            params.append(arg + " ,");
        }
        //打印参数日志
        log.debug(params.substring(0, params.length() -1 ).toString());
    }

    @Around("logPointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            throw e;
        }
        return result;
    }

    @AfterReturning(value = "logPointcut()", returning = "object")
    public void afterReturn(Object object) {
        log.debug("方法正常结束,返回值:{}", object);
    }
}


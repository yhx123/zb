package com.lsjs.zb.aspect;


import com.lsjs.zb.annotation.AvoidRepeatableCommit;
import com.lsjs.zb.common.Constant;
import com.lsjs.zb.util.IPUtil;
import com.lsjs.zb.util.UUIDUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/**
 * @author 杨红星
 * @version 1.0.0
 * @date 2018/5/12
 *
 * 避免重复提交
 * 使用方法
 *  @PostMapping(value = "add")
 *  @AvoidRepeatableCommit(timeout = 50000)
 *  public String insert(@Valid User user){
 *   user.setBirth(new Date());
 *  log.info("请求参数:{}",user);
 *  return userService.insert(user);
 */
@Order
@Aspect
@Component
@Slf4j
public class AvoidRepeatableCommitAspect {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * @param point
     */
    @Around("@annotation(com.lsjs.zb.annotation.AvoidRepeatableCommit)")
    public Object around(ProceedingJoinPoint point) throws Throwable {

        HttpServletRequest request  = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
        String ip = IPUtil.getIP(request);
        //获取注解
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        //目标类、方法
        String className = method.getDeclaringClass().getName();
        String name = method.getName();
        String ipKey = String.format("%s#%s",className,name);
        int hashCode = Math.abs(ipKey.hashCode());
        String key = String.format("%s_%d",ip,hashCode);
        log.info("ipKey={},hashCode={},key={}",ipKey,hashCode,key);
        AvoidRepeatableCommit avoidRepeatableCommit =  method.getAnnotation(AvoidRepeatableCommit.class);
        long timeout = avoidRepeatableCommit.timeout();
        if (timeout < 0){
            timeout = Constant.AVOID_REPEATABLE_TIMEOUT;
        }
        String value = (String) redisTemplate.opsForValue().get(key);
        if (StringUtils.isNotBlank(value)){
            return "请勿重复提交";
        }
        redisTemplate.opsForValue().set(key, UUIDUtil.uuid(),timeout,TimeUnit.MILLISECONDS);
        //执行方法
        Object object = point.proceed();
        return object;
    }

}
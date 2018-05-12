package com.lsjs.zb.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 杨红星
 * @version 1.0.0
 * @date 2018/5/12
 *
 * 避免重复提交
 */


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AvoidRepeatableCommit {
        /**
         * 指定时间内不可重复提交,单位毫秒
         * @return
         */
        long timeout()  default 30000 ;

    }


package com.lsjs.zb.Expection;

import com.lsjs.zb.common.ServerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 杨红星
 * @version 1.0.0
 * @date 2018/5/12
 */
@Slf4j
@RestControllerAdvice
public class GroubExpactionHandle {
    @ExceptionHandler(value = GroubExpaction.class)
    @ResponseBody
    public ServerResponse handle(GroubExpaction e) {

            return ServerResponse.createByErrorCodeMessage(Integer.valueOf(e.getErrorCode()),e.getMessage());
    }

}

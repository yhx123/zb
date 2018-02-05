package com.lsjs.zb.aspect;

import com.lsjs.zb.common.ResponseCode;
import com.lsjs.zb.common.ServerResponse;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * @author 杨红星
 * @version 1.0.0
 *
 */
@Aspect
@Component
public class Validator
{

    @Around("execution(* com.lsjs.zb.controller.*.*.*(..)) && args(..,bindingResult)")
    public Object doAround(ProceedingJoinPoint pjp, BindingResult bindingResult) throws Throwable {
        Object retVal;
        if (bindingResult.hasErrors()) {
            retVal = doErrorHandle(bindingResult);
        } else {
            retVal = pjp.proceed();
        }
        return retVal;
    }


/**
 * 处理错误信息
 * @param result 参数校验结果
 * @return
 */
private ServerResponse doErrorHandle(BindingResult result)
{
    List<FieldError> err = result.getFieldErrors();
    FieldError fe;
    StringBuffer buffer = new StringBuffer();
    for(int i=0; i < err.size(); i++){
        fe = err.get(i);
        buffer.append(fe.getDefaultMessage() + " ,");
    }
    return ServerResponse.createByErrorCodeMessage(Integer.valueOf(ResponseCode.ERROR.getCode()),buffer.substring(0,buffer.length()-1));
}


}

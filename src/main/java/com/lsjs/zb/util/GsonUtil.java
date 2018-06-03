package com.lsjs.zb.util;


import com.google.gson.Gson;
import com.lsjs.zb.common.Constant;
import com.lsjs.zb.common.ResponseCode;
import com.lsjs.zb.pojo.User;
import com.sun.activation.registries.MailcapParseException;
import io.jsonwebtoken.Claims;

/**
 *
 * @author 杨红星
 */
public class GsonUtil {
    //提取token中的用户信息
    public static User createUserUseToToken(String token) throws MailcapParseException {
        try {
            String subject = JwtUtil.parseJWT(token).getSubject();
            return new Gson().fromJson(subject, User.class);

        } catch (Throwable throwable) {
            throw new MailcapParseException(ResponseCode.TOKEN_ERROR.getMessage());
        }
    }

    //判断token的状态 失效返回true
    public static boolean StatusCheckout(String token) {
        Claims claims = JwtUtil.parseJWT(token);
        String status = claims.getId();
        return status.equals(Constant.Consts.STATUS_NOT_VALID);
    }
}

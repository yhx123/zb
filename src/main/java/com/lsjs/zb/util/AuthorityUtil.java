package com.lsjs.zb.util;


import com.lsjs.zb.Expection.GroubExpaction;
import com.lsjs.zb.common.ResponseCode;
import com.lsjs.zb.pojo.User;
import com.sun.activation.registries.MailcapParseException;

/**
 * @author 杨红星
 * @version 1.0.0
 * @date 2018/5/17
 */
public class AuthorityUtil {
    public static void authorityJudge(String token,String phoneNumber) throws GroubExpaction{
        User user = null;
        try {
            user = GsonUtil.createUserUseToToken(token);
        } catch (MailcapParseException e) {
            throw new GroubExpaction(ResponseCode.TOKEN_ERROR);
        }
        if (!user.getPhoneNumber().equals(phoneNumber)) {
            throw new GroubExpaction(ResponseCode.TOKEN_ERROR);
        }
        if (user.getRole() != 0) {
            throw new GroubExpaction(ResponseCode.PERMISSIONS_ERRO);
        }
    }
}

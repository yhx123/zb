package com.lsjs.zb.service;

import com.lsjs.zb.common.ServerResponse;

import javax.mail.MessagingException;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public interface MailService {
    /**
     *
     * @param mail
     * @param code
     * @return
     * @throws MessagingException
     */


    ServerResponse getMailCode(String mail, String code);


}

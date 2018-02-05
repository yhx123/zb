package com.lsjs.zb.service.impl;

import com.lsjs.zb.common.ServerResponse;
import com.lsjs.zb.dao.UserMapper;
import com.lsjs.zb.service.MailService;
import com.lsjs.zb.util.ProductHtmlUtil;
import com.lsjs.zb.util.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @author 杨红星
 * @version 1.0.0
 */
@Service("iSentMail")
public class MailServiceImpl implements MailService {
    final Logger logger = LoggerFactory.getLogger(MailServiceImpl.class);
    @Autowired
    private JavaMailSender sender;

    @Autowired
    private UserMapper userMapper;
    @Override
    public ServerResponse getMailCode(String mail, String code) {
        MimeMessage message = sender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(PropertiesUtil.getProperty("mail.sender"));
            helper.setTo(mail);
            helper.setSubject(PropertiesUtil.getProperty("mail.Subject"));
            String html = ProductHtmlUtil.getHtnl(code);
            helper.setText(html, true);
            sender.send(message);
            logger.info("邮件验证码已经发送。");
        } catch (MessagingException e) {
            logger.error("发送邮件验证码时发生异常！", e);
            return ServerResponse.createByErrorMessage("发送失败");
        }
        return ServerResponse.createBySuccess("发送成功", code);
    }

}

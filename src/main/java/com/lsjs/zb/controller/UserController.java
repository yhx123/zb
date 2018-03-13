package com.lsjs.zb.controller;


import com.lsjs.zb.common.ServerResponse;
import com.lsjs.zb.common.TokenCache;
import com.lsjs.zb.pojo.Discuss;
import com.lsjs.zb.pojo.Reply;
import com.lsjs.zb.pojo.User;
import com.lsjs.zb.pojo.param.LoginParam;
import com.lsjs.zb.service.MailService;
import com.lsjs.zb.service.UserService;
import com.lsjs.zb.config.JwtUserDetailsService;
import com.lsjs.zb.util.SendMsgUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@Api(value = "用户控制器")
@RestController
@RequestMapping("/user")
@CrossOrigin
@Slf4j
public class UserController {
    @Autowired
    private MailService iSentMail;

    @Autowired
    private UserService userService;

    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;

//    /**
//     * 注册 已跑通
//     *
//     * @param user
//     * @param code
//     * @return
//     */
//    @RequestMapping(value = "/mail-register", method = RequestMethod.POST)
//    public ServerResponse<User> registerByMail(User user, String code) {
//
//        UserExample userExample = new UserExample();
//        userExample.createCriteria().andPhoneNumberEqualTo(user.getMail());
//        List<User> users = userMapper.selectByExample(userExample);
//        user.setUserId(KeyGenUtil.genUniqueKey());
//        if (!users.isEmpty()) {
//            return ServerResponse.createByErrorMessage("该邮箱已经存在，请不要重复注册");
//        }
//        String token = TokenCache.getKey(code + user.getPhoneNumber());
//        if (StringUtils.isBlank(token)) {
//            return ServerResponse.createByErrorMessage("您的验证码错误或者已经过期请重新获取");
//        } else {
//            if (!(token.equals(code + user.getMail()))) {
//                return ServerResponse.createByErrorMessage("您的验证码输入错误");
//            } else {
//                return userService.register(user);
//            }
//        }

//    }

    /**
     * 已跑通
     *
     * @param phoneNumber
     * @return
     */
    @GetMapping("/message-code")
    public ServerResponse getMessageCode(String phoneNumber) {
        String code = null;
        try {
            code = SendMsgUtil.sendSCode(phoneNumber);
        } catch (IOException e) {
            e.printStackTrace();
            return ServerResponse.createByErrorMessage("发送验证码失败");
        }
        String s = phoneNumber + code;
        TokenCache.setKey(s, s);

        return ServerResponse.createBySuccess("短信验证码发送成功");
    }

    @RequestMapping(value = "/phone-register", method = RequestMethod.POST)
    public ServerResponse<User> registerByPhone(@RequestBody User user, String code) {

        return userService.registerByPhone(user, code);
    }

    /**
     * 已跑通
     *
     * @param loginParam
     * @return
     */
    @ApiOperation(value = "登录", notes = "")
    @PostMapping("/login")
    public void login(@Valid LoginParam loginParam, BindingResult bindingResult) {

//        return userService.login(loginParam.getUsername(), loginParam.getPassword());

    }

    /**
     * 已跑通
     *
     * @param mail
     * @return
     */
    @ApiOperation(value = "获取邮件验证码", notes = "")
    @RequestMapping(value = "/getMailCode", method = RequestMethod.POST)
    public ServerResponse getMailCode(String mail) {

        Random ne = new Random();
        //为变量赋随机值1000-9999
        int x = ne.nextInt(9999 - 1000 + 1) + 1000;
        String code = Integer.toString(x);
        TokenCache.setKey(code + mail, code + mail);
        return iSentMail.getMailCode(mail, code);

    }

    /**
     * 修改用户基本信息  已跑通
     *
     * @param user
     * @return
     */
    @ApiOperation(value = "修改用户基本信息")
    @PostMapping("/edit")
    public ServerResponse<User> edit(User user) {
        return userService.edit(user);
    }


    /**
     * 评论结果   测试通过
     *
     * @param discuss
     * @return 评论结果
     */

    @ApiOperation(value = "父id表示回复哪条reply，一定是reply_id或0，父id不能为空，如果第一条评论父id为0", notes = "")
    @PostMapping("/discuss-to")
    public ServerResponse discussTo(Discuss discuss) {
        return userService.discussTo(discuss);
    }

    /**
     * 回复评论  测试通过
     *
     * @param reply
     * @return 评论结果
     */
    @PostMapping("/reply-to")
    public ServerResponse replyTo(Reply reply) {
        return userService.replyTo(reply);
    }


    /**
     * 重置密码 测试通过
     *
     * @param messageCode
     * @param newPassWord
     * @param phoneNumber
     * @return
     */
    @PostMapping("/reset-password")
    public ServerResponse resetPassword(String messageCode, String newPassWord, String phoneNumber) {
        return userService.resetPassword(messageCode, newPassWord, phoneNumber);
    }

    @GetMapping("/discuss-by-userid")
    public ServerResponse<ArrayList> getDiscussByUserId(String userId) {
        return userService.getDiscussByUserId(userId);
    }

    @GetMapping("/get-user")
    public ServerResponse<User> getUser(int userId) {
        return userService.getUser(userId);
    }

}

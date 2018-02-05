package com.lsjs.zb.service.impl;

import com.lsjs.zb.dao.UserMapper;
import com.lsjs.zb.pojo.User;
import com.lsjs.zb.pojo.UserExample;
import com.lsjs.zb.util.RegularExpressionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

/**
 * @author 杨红星
 * @version 1.0.0
 */
@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserExample userExample = new UserExample();
        List<User> users = new ArrayList<User>();
        if (RegularExpressionUtil.isPhoneNumber(username)) {
            //是手机号
            userExample.createCriteria().andPhoneNumberEqualTo(username);
            users = (ArrayList) userMapper.selectByExample(userExample);
        } else if (RegularExpressionUtil.isMail(username)) {
            //是邮箱
            userExample.createCriteria().andMailEqualTo(username);
            users = (ArrayList) userMapper.selectByExample(userExample);

        } else {
            //是用户名
            userExample.createCriteria().andUsernameEqualTo(username);
            users = (ArrayList) userMapper.selectByExample(userExample);
        }
        userExample.createCriteria().andUsernameEqualTo(username);
        users = userMapper.selectByExample(userExample);

        if (users.size() == 0) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            User user = users.get(0);
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), emptyList());
        }
    }
}

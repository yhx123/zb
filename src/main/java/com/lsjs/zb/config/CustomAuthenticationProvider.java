package com.lsjs.zb.config;


import com.lsjs.zb.util.MD5Util;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;

/**
 * @author 杨红星
 * @version 1.0.0
 */

public class CustomAuthenticationProvider implements AuthenticationProvider {

    private UserDetailsService userDetailsService;
    public CustomAuthenticationProvider(UserDetailsService userDetailsService){
        this.userDetailsService = userDetailsService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        // 获取认证的用户名 & 密码
        String name = authentication.getName();
        String passwordNotMd5 = authentication.getCredentials().toString();
        String password = MD5Util.MD5EncodeUtf8(passwordNotMd5);

        // 认证逻辑
        UserDetails userDetails = userDetailsService.loadUserByUsername(name);
        if(null != userDetails){
            if(password.equals(userDetails.getPassword())){
                // 生成令牌，返回Authentication对象上设置的授予权限是空的  因为权限是特定于应用程序的
                Authentication auth = new UsernamePasswordAuthenticationToken(name, password, Collections.emptyList());
                return auth;
            }else {
                throw new BadCredentialsException("密码错误~");
            }
        }else {
            throw new UsernameNotFoundException("用户不存在~");
        }
    }

    // 是否可以提供输入类型的认证服务
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}

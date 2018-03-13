package com.lsjs.zb.config;

import com.lsjs.zb.dao.*;
import com.lsjs.zb.pojo.*;
import com.lsjs.zb.util.RegularExpressionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨红星
 * @version 1.0.0
 */
@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PermissionRoleMapper permissionRoleMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private RoleUserMapper roleUserMapper;
    @Autowired
    private RoleMapper roleMapper;

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
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if (users.size() != 0) {
            RoleExample roleExample = new RoleExample();
            roleExample.createCriteria().andIdEqualTo(Integer.valueOf(users.get(0).getUserId()));
            List<Role> roles = roleMapper.selectByExample(roleExample);
            for (Role role : roles) {
                PermissionRole permissionRole = permissionRoleMapper.selectByPrimaryKey(Integer.valueOf(role.getId()));
                Permission permission = permissionMapper.selectByPrimaryKey(Integer.valueOf(permissionRole.getPermissionId()));
                if (permission != null && permission.getName() != null) {
                    GrantedAuthority grantedAuthority = new MyGrantedAuthority(permission.getUrl(), permission.getMethod());
                    grantedAuthorities.add(grantedAuthority);
                }

            }
        }
        if (users.size() == 0)

        {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else

        {
            User user = users.get(0);
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
        }
    }
}

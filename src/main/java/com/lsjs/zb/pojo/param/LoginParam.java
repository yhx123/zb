package com.lsjs.zb.pojo.param;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author 杨红星
 * @version 1.0.0
 */
@Data
public class LoginParam implements UserDetails, Serializable {
    @NotBlank(message = "username 不能为空")
    private String username;
    @NotBlank(message = "password 不能为空")
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


    @Override
    public String toString() {
        return this.username;
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

    @Override
    public boolean equals(Object rhs) {
        return rhs instanceof User ? this.username.equals(((User) rhs).getUsername()) : false;
    }
}

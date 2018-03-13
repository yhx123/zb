package com.lsjs.zb.config;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author 杨红星
 * @version 1.0.0
 * @date 2018/3/13
 */
public class MyGrantedAuthority implements GrantedAuthority {
    private String url;
    private String method;

    public String getUrl() {
        return url;
    }

    public MyGrantedAuthority setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public MyGrantedAuthority setMethod(String method) {
        this.method = method;
        return this;
    }

    public MyGrantedAuthority(String url, String method) {
        this.url = url;
        this.method = method;
    }

    @Override
    public String getAuthority() {
        return this.url + ";" + this.method;
    }
}

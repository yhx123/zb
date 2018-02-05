package com.lsjs.zb.pojo.vo;

import com.lsjs.zb.pojo.User;

import java.util.ArrayList;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public class ServerUserListServerVo {
    private User user;
    private ArrayList<ServerAndUserVo> serverAndUserVos;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<ServerAndUserVo> getServerAndUserVos() {
        return serverAndUserVos;
    }

    public void setServerAndUserVos(ArrayList<ServerAndUserVo> serverAndUserVos) {
        this.serverAndUserVos = serverAndUserVos;
    }
}

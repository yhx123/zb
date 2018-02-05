package com.lsjs.zb.pojo.vo;

import com.lsjs.zb.pojo.Server;
import com.lsjs.zb.pojo.User;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public class ServerAndUserVo {
    private User user;
    private Server server;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }
}

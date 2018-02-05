package com.lsjs.zb.pojo.vo;

import com.lsjs.zb.pojo.ServeringServer;
import com.lsjs.zb.pojo.User;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public class ServeringServerAndUserVo {
    private User user;
    private ServeringServer serveringServer;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ServeringServer getServeringServer() {
        return serveringServer;
    }

    public void setServeringServer(ServeringServer serveringServer) {
        this.serveringServer = serveringServer;
    }
}

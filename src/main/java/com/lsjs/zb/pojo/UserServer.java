package com.lsjs.zb.pojo;

public class UserServer {
    private Integer userId;

    private Integer serverId;

    public UserServer(Integer userId, Integer serverId) {
        this.userId = userId;
        this.serverId = serverId;
    }

    public UserServer() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }
}
package com.lsjs.zb.pojo;

public class UserGetServer {
    private Integer userId;

    private Integer serverId;

    private Integer status;

    public UserGetServer(Integer userId, Integer serverId, Integer status) {
        this.userId = userId;
        this.serverId = serverId;
        this.status = status;
    }

    public UserGetServer() {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
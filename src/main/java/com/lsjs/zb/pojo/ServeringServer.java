package com.lsjs.zb.pojo;

public class ServeringServer {
    private Integer serveringId;

    private Integer serverId;

    private Integer userId;

    private String serverName;

    private String serverPhone;

    private String serverAddress;

    public ServeringServer(Integer serveringId, Integer serverId, Integer userId, String serverName, String serverPhone, String serverAddress) {
        this.serveringId = serveringId;
        this.serverId = serverId;
        this.userId = userId;
        this.serverName = serverName;
        this.serverPhone = serverPhone;
        this.serverAddress = serverAddress;
    }

    public ServeringServer() {
        super();
    }

    public Integer getServeringId() {
        return serveringId;
    }

    public void setServeringId(Integer serveringId) {
        this.serveringId = serveringId;
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public String getServerPhone() {
        return serverPhone;
    }

    public void setServerPhone(String serverPhone) {
        this.serverPhone = serverPhone == null ? null : serverPhone.trim();
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress == null ? null : serverAddress.trim();
    }
}
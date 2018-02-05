package com.lsjs.zb.pojo;

import java.util.Date;

public class Server {
    private Integer serverId;

    private String serverTitle;

    private String serverDescription;

    private Long price;

    private Long serverTime;

    private Integer checkStatus;

    private Integer serverStatus;

    private Integer serverType;

    private String serverLatitude;

    private String serverLongitude;

    private Date createTime;

    private Date updateTime;

    private String serverImg;

    public Server(Integer serverId, String serverTitle, String serverDescription, Long price, Long serverTime, Integer checkStatus, Integer serverStatus, Integer serverType, String serverLatitude, String serverLongitude, Date createTime, Date updateTime, String serverImg) {
        this.serverId = serverId;
        this.serverTitle = serverTitle;
        this.serverDescription = serverDescription;
        this.price = price;
        this.serverTime = serverTime;
        this.checkStatus = checkStatus;
        this.serverStatus = serverStatus;
        this.serverType = serverType;
        this.serverLatitude = serverLatitude;
        this.serverLongitude = serverLongitude;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.serverImg = serverImg;
    }

    public Server() {
        super();
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public String getServerTitle() {
        return serverTitle;
    }

    public void setServerTitle(String serverTitle) {
        this.serverTitle = serverTitle == null ? null : serverTitle.trim();
    }

    public String getServerDescription() {
        return serverDescription;
    }

    public void setServerDescription(String serverDescription) {
        this.serverDescription = serverDescription == null ? null : serverDescription.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getServerTime() {
        return serverTime;
    }

    public void setServerTime(Long serverTime) {
        this.serverTime = serverTime;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(Integer serverStatus) {
        this.serverStatus = serverStatus;
    }

    public Integer getServerType() {
        return serverType;
    }

    public void setServerType(Integer serverType) {
        this.serverType = serverType;
    }

    public String getServerLatitude() {
        return serverLatitude;
    }

    public void setServerLatitude(String serverLatitude) {
        this.serverLatitude = serverLatitude == null ? null : serverLatitude.trim();
    }

    public String getServerLongitude() {
        return serverLongitude;
    }

    public void setServerLongitude(String serverLongitude) {
        this.serverLongitude = serverLongitude == null ? null : serverLongitude.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getServerImg() {
        return serverImg;
    }

    public void setServerImg(String serverImg) {
        this.serverImg = serverImg == null ? null : serverImg.trim();
    }
}
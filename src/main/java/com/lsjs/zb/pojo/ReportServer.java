package com.lsjs.zb.pojo;

import java.util.Date;

public class ReportServer {
    private Integer serverId;

    private Integer userId;

    private Integer reportStatus;

    private String serverMessage;

    private Date createTime;

    public ReportServer(Integer serverId, Integer userId, Integer reportStatus, String serverMessage, Date createTime) {
        this.serverId = serverId;
        this.userId = userId;
        this.reportStatus = reportStatus;
        this.serverMessage = serverMessage;
        this.createTime = createTime;
    }

    public ReportServer() {
        super();
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

    public Integer getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    public String getServerMessage() {
        return serverMessage;
    }

    public void setServerMessage(String serverMessage) {
        this.serverMessage = serverMessage == null ? null : serverMessage.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
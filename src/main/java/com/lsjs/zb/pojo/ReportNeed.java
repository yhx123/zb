package com.lsjs.zb.pojo;

import java.util.Date;

public class ReportNeed {
    private Integer needId;

    private Integer userId;

    private Integer reportStatus;

    private String needMessage;

    private Date createTime;

    public ReportNeed(Integer needId, Integer userId, Integer reportStatus, String needMessage, Date createTime) {
        this.needId = needId;
        this.userId = userId;
        this.reportStatus = reportStatus;
        this.needMessage = needMessage;
        this.createTime = createTime;
    }

    public ReportNeed() {
        super();
    }

    public Integer getNeedId() {
        return needId;
    }

    public void setNeedId(Integer needId) {
        this.needId = needId;
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

    public String getNeedMessage() {
        return needMessage;
    }

    public void setNeedMessage(String needMessage) {
        this.needMessage = needMessage == null ? null : needMessage.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
package com.lsjs.zb.pojo;

import java.util.Date;

public class CreditDetail {
    private Integer creditDetailId;

    private Integer userId;

    private Date time;

    private String activelity;

    private String scoreChage;

    private String description;

    public CreditDetail(Integer creditDetailId, Integer userId, Date time, String activelity, String scoreChage, String description) {
        this.creditDetailId = creditDetailId;
        this.userId = userId;
        this.time = time;
        this.activelity = activelity;
        this.scoreChage = scoreChage;
        this.description = description;
    }

    public CreditDetail() {
        super();
    }

    public Integer getCreditDetailId() {
        return creditDetailId;
    }

    public void setCreditDetailId(Integer creditDetailId) {
        this.creditDetailId = creditDetailId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getActivelity() {
        return activelity;
    }

    public void setActivelity(String activelity) {
        this.activelity = activelity == null ? null : activelity.trim();
    }

    public String getScoreChage() {
        return scoreChage;
    }

    public void setScoreChage(String scoreChage) {
        this.scoreChage = scoreChage == null ? null : scoreChage.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
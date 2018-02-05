package com.lsjs.zb.pojo;

import java.util.Date;

public class Credit {
    private Integer id;

    private Integer userId;

    private String realName;

    private String idNamuber;

    private String creditScore;

    private Date createTime;

    public Credit(Integer id, Integer userId, String realName, String idNamuber, String creditScore, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.realName = realName;
        this.idNamuber = idNamuber;
        this.creditScore = creditScore;
        this.createTime = createTime;
    }

    public Credit() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdNamuber() {
        return idNamuber;
    }

    public void setIdNamuber(String idNamuber) {
        this.idNamuber = idNamuber == null ? null : idNamuber.trim();
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore == null ? null : creditScore.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
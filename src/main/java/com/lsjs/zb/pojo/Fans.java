package com.lsjs.zb.pojo;

public class Fans {
    private Integer fansId;

    private Integer userId;

    public Fans(Integer fansId, Integer userId) {
        this.fansId = fansId;
        this.userId = userId;
    }

    public Fans() {
        super();
    }

    public Integer getFansId() {
        return fansId;
    }

    public void setFansId(Integer fansId) {
        this.fansId = fansId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
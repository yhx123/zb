package com.lsjs.zb.pojo;

public class UserFans {
    private Integer userId;

    private Integer fansId;

    public UserFans(Integer userId, Integer fansId) {
        this.userId = userId;
        this.fansId = fansId;
    }

    public UserFans() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFansId() {
        return fansId;
    }

    public void setFansId(Integer fansId) {
        this.fansId = fansId;
    }
}
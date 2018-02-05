package com.lsjs.zb.pojo;

public class UserNeed {
    private Integer needId;

    private Integer userId;

    public UserNeed(Integer needId, Integer userId) {
        this.needId = needId;
        this.userId = userId;
    }

    public UserNeed() {
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
}
package com.lsjs.zb.pojo;

public class UserGetNeed {
    private Integer userId;

    private Integer needId;

    private Integer status;

    public UserGetNeed(Integer userId, Integer needId, Integer status) {
        this.userId = userId;
        this.needId = needId;
        this.status = status;
    }

    public UserGetNeed() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNeedId() {
        return needId;
    }

    public void setNeedId(Integer needId) {
        this.needId = needId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
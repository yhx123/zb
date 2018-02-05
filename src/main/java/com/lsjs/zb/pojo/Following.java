package com.lsjs.zb.pojo;

public class Following {
    private Integer followeringId;

    private Integer userId;

    public Following(Integer followeringId, Integer userId) {
        this.followeringId = followeringId;
        this.userId = userId;
    }

    public Following() {
        super();
    }

    public Integer getFolloweringId() {
        return followeringId;
    }

    public void setFolloweringId(Integer followeringId) {
        this.followeringId = followeringId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
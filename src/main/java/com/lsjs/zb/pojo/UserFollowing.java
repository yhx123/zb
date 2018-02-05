package com.lsjs.zb.pojo;

public class UserFollowing {
    private Integer userId;

    private Integer followingId;

    public UserFollowing(Integer userId, Integer followingId) {
        this.userId = userId;
        this.followingId = followingId;
    }

    public UserFollowing() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFollowingId() {
        return followingId;
    }

    public void setFollowingId(Integer followingId) {
        this.followingId = followingId;
    }
}
package com.lsjs.zb.pojo;

import java.util.Date;

public class Need {
    private Integer needId;

    private String needTitle;

    private String needDescription;

    private Long reward;

    private String longitude;

    private String latitude;

    private Integer needType;

    private Date createTime;

    private Date updateTime;

    private Integer goodsStatus;

    private Integer checkStatus;

    private String needImg;

    private Long needTime;

    public Need(Integer needId, String needTitle, String needDescription, Long reward, String longitude, String latitude, Integer needType, Date createTime, Date updateTime, Integer goodsStatus, Integer checkStatus, String needImg, Long needTime) {
        this.needId = needId;
        this.needTitle = needTitle;
        this.needDescription = needDescription;
        this.reward = reward;
        this.longitude = longitude;
        this.latitude = latitude;
        this.needType = needType;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.goodsStatus = goodsStatus;
        this.checkStatus = checkStatus;
        this.needImg = needImg;
        this.needTime = needTime;
    }

    public Need() {
        super();
    }

    public Integer getNeedId() {
        return needId;
    }

    public void setNeedId(Integer needId) {
        this.needId = needId;
    }

    public String getNeedTitle() {
        return needTitle;
    }

    public void setNeedTitle(String needTitle) {
        this.needTitle = needTitle == null ? null : needTitle.trim();
    }

    public String getNeedDescription() {
        return needDescription;
    }

    public void setNeedDescription(String needDescription) {
        this.needDescription = needDescription == null ? null : needDescription.trim();
    }

    public Long getReward() {
        return reward;
    }

    public void setReward(Long reward) {
        this.reward = reward;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Integer getNeedType() {
        return needType;
    }

    public void setNeedType(Integer needType) {
        this.needType = needType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getNeedImg() {
        return needImg;
    }

    public void setNeedImg(String needImg) {
        this.needImg = needImg == null ? null : needImg.trim();
    }

    public Long getNeedTime() {
        return needTime;
    }

    public void setNeedTime(Long needTime) {
        this.needTime = needTime;
    }
}
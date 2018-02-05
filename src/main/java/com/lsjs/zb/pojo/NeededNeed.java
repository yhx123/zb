package com.lsjs.zb.pojo;

public class NeededNeed {
    private Integer neededId;

    private Integer needId;

    private Integer userId;

    private String neededName;

    private String neededAddress;

    private String neededPhone;

    public NeededNeed(Integer neededId, Integer needId, Integer userId, String neededName, String neededAddress, String neededPhone) {
        this.neededId = neededId;
        this.needId = needId;
        this.userId = userId;
        this.neededName = neededName;
        this.neededAddress = neededAddress;
        this.neededPhone = neededPhone;
    }

    public NeededNeed() {
        super();
    }

    public Integer getNeededId() {
        return neededId;
    }

    public void setNeededId(Integer neededId) {
        this.neededId = neededId;
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

    public String getNeededName() {
        return neededName;
    }

    public void setNeededName(String neededName) {
        this.neededName = neededName == null ? null : neededName.trim();
    }

    public String getNeededAddress() {
        return neededAddress;
    }

    public void setNeededAddress(String neededAddress) {
        this.neededAddress = neededAddress == null ? null : neededAddress.trim();
    }

    public String getNeededPhone() {
        return neededPhone;
    }

    public void setNeededPhone(String neededPhone) {
        this.neededPhone = neededPhone == null ? null : neededPhone.trim();
    }
}
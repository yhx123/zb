package com.lsjs.zb.pojo;

public class Discuss {
    private Integer discussId;

    private Integer childId;

    private String serverOrNeedId;

    private Integer parentId;

    private Integer userId;

    private String content;

    private String discussImg;

    public Discuss(Integer discussId, Integer childId, String serverOrNeedId, Integer parentId, Integer userId, String content, String discussImg) {
        this.discussId = discussId;
        this.childId = childId;
        this.serverOrNeedId = serverOrNeedId;
        this.parentId = parentId;
        this.userId = userId;
        this.content = content;
        this.discussImg = discussImg;
    }

    public Discuss() {
        super();
    }

    public Integer getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Integer discussId) {
        this.discussId = discussId;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public String getServerOrNeedId() {
        return serverOrNeedId;
    }

    public void setServerOrNeedId(String serverOrNeedId) {
        this.serverOrNeedId = serverOrNeedId == null ? null : serverOrNeedId.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDiscussImg() {
        return discussImg;
    }

    public void setDiscussImg(String discussImg) {
        this.discussImg = discussImg == null ? null : discussImg.trim();
    }
}
package com.lsjs.zb.pojo;

public class Reply {
    private Integer replyId;

    private Integer childId;

    private Integer parentId;

    private String content;

    private String replyImg;

    public Reply(Integer replyId, Integer childId, Integer parentId, String content, String replyImg) {
        this.replyId = replyId;
        this.childId = childId;
        this.parentId = parentId;
        this.content = content;
        this.replyImg = replyImg;
    }

    public Reply() {
        super();
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getReplyImg() {
        return replyImg;
    }

    public void setReplyImg(String replyImg) {
        this.replyImg = replyImg == null ? null : replyImg.trim();
    }
}
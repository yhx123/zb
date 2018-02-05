package com.lsjs.zb.pojo;

public class DiscussReply {
    private Integer discussId;

    private Integer replyId;

    public DiscussReply(Integer discussId, Integer replyId) {
        this.discussId = discussId;
        this.replyId = replyId;
    }

    public DiscussReply() {
        super();
    }

    public Integer getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Integer discussId) {
        this.discussId = discussId;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }
}
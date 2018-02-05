package com.lsjs.zb.pojo.vo;

import com.lsjs.zb.pojo.Discuss;
import com.lsjs.zb.pojo.User;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public class DiscussAndUserVo {
    private User user;
    private Discuss discuss;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Discuss getDiscuss() {
        return discuss;
    }

    public void setDiscuss(Discuss discuss) {
        this.discuss = discuss;
    }
}

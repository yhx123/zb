package com.lsjs.zb.pojo.vo;

import com.lsjs.zb.pojo.NeededNeed;
import com.lsjs.zb.pojo.User;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public class NeededAndUserVo {
    private NeededNeed neededNeed;
    private User user;

    public NeededNeed getNeededNeed() {
        return neededNeed;
    }

    public void setNeededNeed(NeededNeed neededNeed) {
        this.neededNeed = neededNeed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

package com.lsjs.zb.pojo.vo;

import com.lsjs.zb.pojo.User;

import java.util.ArrayList;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public class NeedUserListServerVo {
    private User user;
    private ArrayList<NeedAndUserVo>  needAndUserVos;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<NeedAndUserVo> getNeedAndUserVos() {
        return needAndUserVos;
    }

    public void setNeedAndUserVos(ArrayList<NeedAndUserVo> needAndUserVos) {
        this.needAndUserVos = needAndUserVos;
    }
}

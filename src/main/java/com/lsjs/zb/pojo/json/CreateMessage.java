package com.lsjs.zb.pojo.json;

import java.util.List;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public class CreateMessage {
    private String name;
    private List<String> m;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getM() {
        return m;
    }

    public void setM(List<String> m) {
        this.m = m;
    }
}

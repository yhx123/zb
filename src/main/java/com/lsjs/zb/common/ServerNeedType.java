package com.lsjs.zb.common;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public enum ServerNeedType {
    design(1,"设计") ,
    photo(2,"照片") ,
    handwork(3,"手工") ,
    fix(4,"维修") ,
    education(5,"教育") ,
    beauty(6,"美妆") ,
    game(7,"游戏") ,
    heart(8,"心灵") ,
    profession(9,"专业咨询");
    private  int code;
    private String type;


    ServerNeedType(int code, String type) {
        this.code = code;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

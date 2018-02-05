package com.lsjs.zb.common;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public enum ResponseCode implements IRespCode {
    SUCCESS("0", "SUCCESS"),
    ERROR("1","ERROR"),
    NEED_LOGIN("10","NEED_LOGIN");

    private  String code;
    private   String desc;
    private String message;


    @Override
    public String getCode(){
        return this.code;
    }
    public String getDesc(){
        return this.desc;
    }
    /**
     * 错误码
     *
     * @return
     */
    ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }


    /**
     * 错误信息
     *
     * @return
     */
    @Override
    public String getMessage() {
        return this.message;
    }


    @Override
    public String toString() {
        return "[" + code + "]" + message;
    }

}

package com.lsjs.zb.common;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public class Constant {
    public static final String CURRENT_USER = "currentUser";
    public static final String AUTH_KEY= "authorization";
    /**JWT 秘钥*/
    public static final String SECRET = "XX#$%()(#*!()!KL<><MQLMNQNQJQK sdfkjsdrow32234545fdf>?N<:{LWPW";
    /**jwt失效时间 4个小时*/
    public static final Long JWT_EXPIRE = 4 * 60 * 60 * 1000L;
    /**验证码code*/
    public static final String IMAGE_CODE = "imagecode";

    //redis默认失效时间
    public static final Long REDIS_DEFAULT_EXPIRE = 3600 * 1L;

    /**
     * 重复提交默认时间30000毫秒
     */
    public static final long AVOID_REPEATABLE_TIMEOUT = 30000 ;

    public interface Role {
        //普通用户
        int ROLE_CUSTOMER = 0;
        //管理员
        int ROLE_ADMIN = 1;
    }


    public interface Consts {
        /**鉴权的key*/
        public static final String AUTH_KEY = "authorization";
        /**JWT 秘钥*/
        public static final String SECRET = "XX#$%()(#*!()!KL<><MQLMNQNQJQK sdfkjsdrow32234545fdf>?N<:{LWPW";
        /**jwt失效时间 4个小时*/
        public static final Long JWT_EXPIRE = 4 * 60 * 60 * 1000L;
        /**验证码code*/
        public static final String IMAGE_CODE = "imagecode";
        /***有效的状态*/
        public static final String STATUS_VALID = "1";
        /***失效的状态*/
        public static final String STATUS_NOT_VALID = "0";
    }

}

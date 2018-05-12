package com.lsjs.zb.util;

import java.util.UUID;

/**
 * @author 杨红星
 * @version 1.0
 * @since 1.8
 */
public class UUIDUtil {

    public static String uuid(){
        return UUID.randomUUID().toString().replace("-","").toLowerCase();
    }
}

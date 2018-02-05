package com.lsjs.zb.util;

import java.util.Random;

public class KeyGenUtil {
    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     *
     * @return
     */
    public static synchronized Integer genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return number;

    }
}

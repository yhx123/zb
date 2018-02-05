package com.lsjs.zb.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public class RegularExpressionUtil {
    private static Pattern phineNumber = Pattern.compile("^1[3|4|5|7|8][0-9]{9}$");
    private static Pattern Mail = Pattern.compile("^[a-z0-9!#$%&'*+\\/=?^_`{|}~.-]+@[a-z0-9]([a-z0-9-]*[a-z0-9])?(\\.[a-z0-9]([a-z0-9-]*[a-z0-9])?)*$");


    public static boolean isPhoneNumber(String username) {

        Matcher matcher = phineNumber.matcher(username);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public static boolean isMail(String username) {
        Matcher matcher = Mail.matcher(username);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

}

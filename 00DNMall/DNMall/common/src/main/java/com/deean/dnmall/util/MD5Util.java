package com.deean.dnmall.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    public static String md5(String password) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        md.update(password.getBytes());
        //BigInteger 将8位的字符串 转成16位的字符串 得到的字符串形式是哈希码值
        //BigInteger(参数1,参数2) 参数1 是 1为正数 0为0 -1为负数
        return new BigInteger(1, md.digest()).toString(16);
    }
}

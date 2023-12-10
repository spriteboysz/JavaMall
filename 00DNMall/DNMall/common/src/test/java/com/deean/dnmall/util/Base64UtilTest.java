package com.deean.dnmall.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Base64UtilTest {

    @Test
    void base64Test() {
        String msg = "Hello world";
        System.out.println(Base64Util.encode(msg));
        assertEquals(msg, Base64Util.decode(Base64Util.encode(msg)));
    }
}
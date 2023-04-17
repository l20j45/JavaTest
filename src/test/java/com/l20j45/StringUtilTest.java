package com.l20j45;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat_oneTime() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }
    @Test
    public void testRepeat_zeroTime() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }
    @Test
    public void testRepeat_multipleTime() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeat_zeroTimes() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", -1));
    }

/*    private static void assertEquals(String actual, String esperado) {
        if (!actual.equals(esperado)) {
            throw new RuntimeException(actual + " is not equal to expected " + esperado);
        }

    }*/
}
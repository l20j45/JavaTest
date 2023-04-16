package com.l20j45;



public class StringUtilTest {
    public static void main(String[] args) {

        assertEquals(StringUtil.repeat("hola",3),"holaholahola");


        assertEquals(StringUtil.repeat("hola",1),"hola");

    }

    private static void assertEquals(String actual, String esperado) {
        if(!actual.equals(esperado)){
            throw new RuntimeException(actual + " is not equal to expected "+ esperado);
        }

    }
}
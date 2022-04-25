package com.base01;

public class BaseRefType {
    public static void main(String[] args) {
        int i=5;
        Integer integer= Integer.valueOf(5);
        int i2=integer.intValue();
        String str=integer.toString();
        str=String.valueOf(i);
        i=Integer.parseInt(str);
        float f=3.14f;
        str=String.valueOf(f);
        f=Float.parseFloat("3.1a2");
    }
}

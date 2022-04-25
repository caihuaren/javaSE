package com.base01;

public class BaseVariableType {
    float pi=3.14f;
    double d=2.34234234;
    int a=365;
    int b=12;
    char cc='恰';
    boolean bool=false;
    String str="tset";

    public static String getType(Object o){
        return o.getClass().toString();
    }

    public static void main(String[] args) {
        long val=22L;
        int i1=1;
        int i2=0x1a;
        int i3=02;
        int i4=0b111;
        double d1=12e10;
        char c1='3';
        char tab='\t';
        char carriageReturn='\r';
        char newLine='\n';
        char doubleQuote='\"';
        char singleQuote='\'';
        char backslash='\\';
        // System.out.println(tab);
        //System.out.println(backslash);
        short s1='a';
        short s2='A';
        short s3='Z';
        short s4='z';

        System.out.println(getType(s4+s3));
    }
}

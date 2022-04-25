package com.base01;

public class StringBufferStudy {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("let there be light");
        System.out.println(sb);
        sb.delete(4,10);
        System.out.println(sb);
        sb.insert(4,"there ");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        String s1="";
        StringBuffer s2=new StringBuffer("");
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) {
            s1+=getRandStr();
        }
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) {
            s2.append(getRandStr());
        }
        System.out.println(System.currentTimeMillis());
    }
    public static String getRandStr(){
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < 10; i++) {
            sb.append((char)(Math.random()*126));
        }
        return sb.toString();
    }

}

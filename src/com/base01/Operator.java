package com.base01;

public class Operator {
    public static void main(String[] args) {
        //int i = 1;
        //int j = ++i + i++ + ++i + ++i + i++;
        //System.out.println(j);
        int a=2;
        //长路与,无论第一个表达式的值是否为false，都会对第二个表达式的值进行判断
        System.out.println(a==3&a!=3);
        //短路与，如果第一个表达式为false，就不会对第二个表达式进行判断
        System.out.println(a==3&&a!=5);
        //长路与和短路与的最终结果相等，但是判断逻辑不同
        int i = 1;
        boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
        System.out.println(b);
        System.out.println(i);
    }
}

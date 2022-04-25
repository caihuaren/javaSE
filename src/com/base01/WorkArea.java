package com.base01;

public class WorkArea {
    int i=0;
    public void testMethod(final int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        WorkArea w1=new WorkArea();
        w1.testMethod(1);
        w1.testMethod(2);
        new WorkArea().testMethod(1);
    }
}

package com.base01;

public class ObjectMethod {
    @Override
    protected void finalize() {
        System.out.println("对象被回收时执行的方法");
    }

    @Override
    public boolean equals(Object obj) {
        if(1==2)
            return true;
        return false;
    }

    public static void main(String[] args) {
        ObjectMethod ob;
        for (int i = 0; i < 100000; i++) {
            ob=new ObjectMethod();
        }
    }
}

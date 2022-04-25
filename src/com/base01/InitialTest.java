package com.base01;

public class InitialTest {
    static String name;
    static {
        System.out.println(name);
        System.out.println("静态代码块");
        name="name2";
        System.out.println(name);
    }
    public InitialTest(){
        this.name="name3";
        System.out.println(name);
    }
    public void printRes(){
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        new InitialTest();
    }
}

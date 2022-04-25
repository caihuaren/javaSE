package com.base01;

public interface AP {
    public void magicAttack();
    //将通用方法写出具体的实现
    default public void revive(){
        System.out.println("法师复活了");
    }
}

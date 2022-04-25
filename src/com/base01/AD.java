package com.base01;

public interface AD {
    public void physicAttack();
    default  public void revive(){
        System.out.println("射手复活了");
    }
}

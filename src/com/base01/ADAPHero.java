package com.base01;

public class ADAPHero extends Hero implements AD,AP,Mortal{

    public ADAPHero (){
        super("",43);
    }
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void revive() {
        System.out.println("滴滴");
    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }


    @Override
    public void die() {
        System.out.println("adaphero die");
    }
}

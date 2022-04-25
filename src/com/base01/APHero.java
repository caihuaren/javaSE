package com.base01;

public class APHero extends Hero implements AP,Mortal{
    public APHero(){
        super("",3);
    }
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die() {
        System.out.println("aphero die");
    }
}

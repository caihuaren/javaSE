package com.base01;

public class ADHero extends Hero implements AD,Mortal{
    public ADHero(){
        super("",6);
        System.out.println("子类的无参构造方法");
    }
    public ADHero(String name,float hp){
        super(name,hp);
        System.out.println("子类带参构造方法");
    }
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void die() {
        System.out.println("ADHero die");
    }

    public static void main(String[] args) {
        Hero h=new ADHero();
        System.out.println(h.hp);
        System.out.println();
    }
}

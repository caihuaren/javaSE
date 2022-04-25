package com.base01;

public class Armor extends Item{
    int ac;
    public Armor(String name,int price,int ac){
        this.ac=ac;
        this.name=name;
        this.price=price;
    }

   public Armor(){}

    @Override
    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        new Armor().test();
    }
}

package com.base01;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs=legs;
    }
    public abstract void eat();
    public void walk(){
        System.out.println("用"+this.legs+"条腿走路");
    }

    public static void main(String[] args) {
        class Test extends Animal{

            protected Test(int legs) {
                super(legs);
            }

            @Override
            public void eat() {

            }
        }
    }
}

package com.base01;

public class Fish extends Animal implements Pet{
    public Fish(){
        super(0);
    }
    private String name;
    @Override
    public void eat() {

    }
    public void walk(){
        System.out.println("鱼没有腿不能走路");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {

    }
}

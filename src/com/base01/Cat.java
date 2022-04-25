package com.base01;

public class Cat extends Animal implements Pet {
    String name;
    public Cat(String name){
        super(4);
        this.name=name;
    }
    public Cat(){
        this("");
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

    @Override
    public void eat() {

    }
}

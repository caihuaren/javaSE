package com.collection;

public class Hero implements Test{
    String name;
    public Hero(){}
    public Hero(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "name:"+name;
    }
}

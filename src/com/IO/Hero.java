package com.IO;

import java.io.Serializable;

public class Hero implements Serializable {
    String name;
    float hp;
    public Hero(){}
    public  Hero(String name,float hp){
        this.name=name;
        this.hp=hp;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}

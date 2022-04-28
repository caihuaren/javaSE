package com.collection;

public class Hero implements Test,Comparable<Hero>{
    String name;
    public float hp;
    public Hero(){}
    public Hero(String name){
        this.name=name;
    }

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }

    @Override
    public int compareTo(Hero o) {
        return (int)(hp-o.hp);
    }
}

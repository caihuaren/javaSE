package com.collection;

import com.base01.AD;

import java.util.ArrayList;
import java.util.List;

public class GenericStudy<T> {
    /*public static void main(String[] args) {
        List<? super Hero> list=new ArrayList<>();
        list.add(new Hero());
        System.out.println(list.get(0));
    }*/
    public static void iteratorElement(List<? extends Hero> list){
        for (Hero hero : list) {
            System.out.println(hero);
        }
    }

    public static void main(String[] args) {
        List<Hero> l1=new ArrayList<>();
        l1.add(new ADHero("e",2));
        l1.add(new Hero("test",2));
        List<ADHero> l2=new ArrayList<>();
        l2.add(new ADHero("1",2));
        iteratorElement(l1);
        iteratorElement(l2);
    }

}

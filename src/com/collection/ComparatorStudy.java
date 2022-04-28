package com.collection;

import java.util.*;

public class ComparatorStudy {
    public static void main(String[] args) {

        Comparator<Hero> comparator=new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return (int)(o2.hp-o1.hp);
            }
        };
        List<Hero> heroes=new ArrayList<>();
        TreeSet<Hero>  set=new TreeSet<>(comparator);
        for (int i = 0; i < 10; i++) {
            heroes.add(new Hero("hero"+i,(float)(100*Math.random())));
            set.add(new Hero("hero"+i,(float)(100*Math.random())));
        }
        Collections.sort(heroes, (Hero o1, Hero o2) -> (int)(o2.hp-o1.hp));
        System.out.println(heroes);
        System.out.println(set);
    }
}

package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListStudy {
    public static void main(String[] args) {
        /*List<Hero> list=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Hero("hero"+i));
        }
        System.out.println(list);
        System.out.println(list.contains(new Hero("hero1")));
        System.out.println(list.get(4));
        System.out.println(list.indexOf(new Hero("hero1")));
        System.out.println(list.remove(new Hero("hero0")));
        //list.set(5,new Hero());
        Hero[] heroes=list.toArray(new Hero[]{});
        System.out.println(Arrays.toString(heroes));
        list.addAll(2,list);
        System.out.println(list);
        for(Hero h:list) {
            if(h.name.equals("hero1")) {
                System.out.println(true);
                break;
            }
        }
        ArrayList<Test> l=new ArrayList<>();
        l.add(new Hero());
        l.add(new Item());
        Iterator<Hero> iterator=list.listIterator();
        while (iterator.hasNext()) System.out.println(iterator.next());*/
        List<Hero> list=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Hero("hero"+i));
        }
        System.out.println(list);
        Iterator<Hero> iterator=list.iterator();
        ArrayList<Hero> arrayList=new ArrayList<>();
        while (iterator.hasNext()){
            Hero h=iterator.next();
            String temp= h.name.replace("hero","");
            if(Integer.parseInt(temp)%8==0) arrayList.add(h);
        }
        for (Hero hero : arrayList) {
            list.remove(hero);
        }
        System.out.println(list);
    }
}

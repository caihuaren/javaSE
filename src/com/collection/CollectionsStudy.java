package com.collection;

import java.util.*;

public class CollectionsStudy {
    public static void main(String[] args) {
        /*HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(1);
        hashSet.add(0);
        ArrayList list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(0);
        Collections.sort(list);
        Collections.shuffle(list);
        Collections.swap(list,0,1);
        Collections.rotate(list,1);
        System.out.println(list);
        List<Integer> list1=(List<Integer>)Collections.synchronizedList(list);
        System.out.println(list1);*/
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        int count=0;
        for (int i = 0; i < 1000000; i++) {
            Collections.shuffle(list);
            if(list.get(0)==3&&list.get(1)==1&&list.get(2)==4) count++;
        }
        System.out.println(count);
        Set<Integer> set=new HashSet<>();
        while (set.size()<50) {
            set.add((int)(Math.random()*10000));
        }
        System.out.println(set);
    }
}

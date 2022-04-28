package com.collection;

import java.util.*;

public class HashMapStudy {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);
        for (Integer integer : map.keySet()) {
            System.out.print(map.get(integer)+" ");
        }
        System.out.println();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        Iterator<Map.Entry<Integer,Integer>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }for(Integer i:map.values()) System.out.print(i+" ");
        System.out.println();
        Random random=new Random();
        HashMap<String,String> map1=new HashMap<>();
        HashMap<String,String> map2=new HashMap<>();
        map1.put("adc", "物理英雄");
        map1.put("apc", "魔法英雄");
        map1.put("t",  "坦克");
        Set<String> set=map1.keySet();
        for (String s : set) {
            map2.put(map1.get(s),s);
        }
        map1=map2;
        System.out.println(map1.values());
    }
}

package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare{
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new LinkedList<>();
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 10000000; i++) {
            l1.add(l1.size()/2,(int)(Math.random()*10));
        }
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 10000000; i++) {
            l2.add(l2.size()/2,(int)(Math.random()*10));
        }
        System.out.println(System.currentTimeMillis());
    }
}

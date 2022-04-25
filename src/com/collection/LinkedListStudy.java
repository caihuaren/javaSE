package com.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListStudy {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1);
        list.add(2);
        list.addLast(3);
        list.addFirst(-1);
        System.out.println(list);
        list.remove(0);
        System.out.println(list.getFirst());
        System.out.println(list);
        System.out.println(list.offer(1));
        System.out.println(list.poll());
        System.out.println(list.peek());
    }
}

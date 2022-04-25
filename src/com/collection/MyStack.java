package com.collection;

import java.util.LinkedList;

public class MyStack implements Stack{
    LinkedList<Hero> list=new LinkedList();
    @Override
    public void push(Hero h) {
        list.offer(h);
    }

    @Override
    public Hero pull() {
        return list.removeLast();
    }

    @Override
    public Hero peek() {
        return list.getLast();
    }

    public static void main(String[] args) {
        MyStack stack=new MyStack();
        for (int i = 0; i < 5; i++) {
            stack.push(new Hero("hero"+i));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pull());
        }
    }
}

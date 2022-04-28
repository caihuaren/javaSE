package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Node<T extends Comparable<T>> {
    Node<T> left;
    Node<T> right;
    T value;
    public void add(T i){
        if(value==null) value=i;
        else if (i.compareTo(value)<=0) {

        }
    }

   /* public Node left;
    public Node right;
    public Object value;
    public void add(int i){
        if(this.value==null) this.value=i;
        else if((Integer)value-i>0){
            if(this.left==null) {
                this.left=new Node();
                this.left.value=i;
            }else this.left.add(i);
        }else {
            if(this.right==null){
                this.right=new Node();
                this.right.value=i;
            }else this.right.add(i);
        }
    }
    public List<Integer> middleTraverse(Node node){
        List<Integer> list=new ArrayList<>();
        if(node.left!=null)
            list.addAll(middleTraverse(node.left));
        list.add((Integer) node.value);
        if(node.right!=null)
            list.addAll(middleTraverse(node.right));
        return list;
    }
    public static void main(String[] args) {
        int[] a={67,7,30,73,10,0,78,81,10,74};
        Node n=new Node();
        for (int i : a) {
            n.add(i);
        }
        System.out.println(n.middleTraverse(n));
    }*/
}

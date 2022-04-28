package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetStudy {
    public static void main(String[] args) {
        /*HashSet<String> set=new HashSet<>();
        HashSet<String> set1=new HashSet<>();
        String[] s=new String[100];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                s[i*20+j]=getRandStr(2);
                    System.out.print(s[i*20+j]+" ");
                if(set.contains(s[i*20+j])) set1.add(s[i*20+j]);
                else set.add(s[i*20+j]);
            }
            System.out.println();
        }
        System.out.println("==============");
        System.out.println(set1);*/
       /* set.add("test");
        set.add("hero");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
        Iterator<String> iterator= set.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());*/
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        char[] cc=Double.toString(Math.PI).replace(".","").toCharArray();
        for (char c : cc) {
            set.add(c);
        }
        System.out.println(set);
    }
    public static String getRandStr(int len){
        char[] cc=new char[len];
        for (char i=0;i<cc.length;i++) {
            cc[i]=(char) (Math.random()*123);
        }
        return new String(cc);
    }
}

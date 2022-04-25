package com.base01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringBase {
    static String res="";
    public static void main(String[] args) {
       /* System.out.println();
        String s1="ab";
        String s2="a"+"b";
        System.out.println(s1==s2);
        String s3=String.format("%skjk%s",s1,s2);
        System.out.println(s3);
        System.out.println((char) 65);*/
       /* String password=randomStr();

        getRes(password);
        System.out.println(res);
        System.out.println(password);*/
        /*String str="let there be light";
        String res="";
        String[] ss=str.split(" ");
        for(String s:ss){
            res+=Character.toUpperCase(s.charAt(0))+s.substring(1)+" ";
        }
        res=res.substring(0,res.length()-1);
        System.out.println(res);
        str="peter piper picked a peck of pickled peppers";
        ss=str.split(" ");
        int count=0;
        for (String s : ss) {
            if(s.charAt(0)=='p') count++;
        }
        System.out.println(count);
        str="legendary";
        System.out.println(str.substring(0,str.length()-1)+Character.toUpperCase(str.charAt(str.length()-1)));
        char cc[]=str.toCharArray();
        for (int i = 0; i < cc.length; i++) {
            if(i%2==0) cc[i]=Character.toUpperCase(cc[i]);
        }
        System.out.println(new String((cc)));
        str="Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        int index=str.lastIndexOf("two");
        str=str.substring(0,index-1)+Character.toUpperCase(str.charAt(index))+str.substring(index+1);
        System.out.println(str);*/
        String[][] cc =new String[20][20];
        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i < cc.length; i++) {
            for (int j = 0; j < cc[0].length; j++) {
                cc[i][j]=randomStr(2);
                if(map.containsKey(cc[i][j])) map.put(cc[i][j],map.get(cc[i][j])+1);
                else map.put(cc[i][j],1);
               // System.out.println(map.get(cc[i][j]));
            }
            System.out.println(Arrays.toString(cc[i]));
        }
        for(String str:map.keySet()){
            if(map.get(str)>1) System.out.print(str+" ");
        }
        System.out.println();
     }
    public static void getRes(String password){
        if(res.equals(password)) return;
        char c=password.charAt(res.length());
        for (int i = 44; i < 123; i++) {
          //  System.out.println(i);
            if(c==i) {
                res += (char) i;

                break;
            }
        }
        getRes(password);
       // System.out.println(res);
    }
    public static String randomStr(int a){
        String s="";
        while (s.length()<a){
            int i=(int)(Math.random()*123);
            if((i>=48&&i<=57)||(i>=65&&i<=90)||(i>=97&&i<=122)){
                s+=(char)i;
            }
        }
        return s;
    }
}

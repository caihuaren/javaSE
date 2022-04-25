package com.base01;

import java.util.Scanner;

public class BitOperator {
    public static void main(String[] args) {
        //int i=4;
        //System.out.println(Integer.toBinaryString(i));
        System.out.println(~4);//取非

        System.out.println(16<<1);
        System.out.println(-16>>>1);
        System.out.println(15>>1);
        int i = 3; // 二进制是11
        int j = 2; // 二进制是10
        int c = ((i | j) ^ (i & j)) << 2 >>> 1;
        System.out.println(c);
        i+=++i;
        System.out.println(i);
        Scanner in=new Scanner(System.in);
        int day=in.nextInt();
        System.out.println(day<=5?"工作日":"周末");
    }
}

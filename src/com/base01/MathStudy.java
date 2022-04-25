package com.base01;

public class MathStudy {
    public static void main(String[] args) {
        double d=Double.MAX_VALUE;
        double res=Math.pow((1+(double)1/Integer.MAX_VALUE),Integer.MAX_VALUE);
        System.out.println(1+(double)1/Integer.MAX_VALUE);
        System.out.println(res);
        System.out.println(Math.E);
        int count=0;
        for(int i=2;i<=1e7;i++){
            if(test(i)) count++;
        }
        System.out.println(count);
    }
    public  static boolean test(int i){
       // System.out.println(Math.sqrt(i));
        for(int a=2;a<=Math.sqrt(i);a++){
            if(i%a==0) return false;
        }
        return true;
    }
}

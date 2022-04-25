package com.base01;

import java.util.Arrays;

public class ArrayStudy {
    public static void main(String[] args) {
       int[][] a=new int[5][5];
       int n=0,x=0,y=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=(int)(Math.random()*100);
                if(a[i][j]>n){
                    n=a[i][j];
                    x=i;
                    y=j;
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int[] b=new int[25];
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(a[i],0,b,5*i,a[i].length);
        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

    }
    public static void quickSort(int[] a,int l,int r){
        int temp=a[l],tempL=l,tempR=r;
        while (tempR>tempL){
            while (tempR>tempL&&a[tempR]>=temp) tempR--;
            while (tempR>tempL&&a[tempL]<=temp) tempL++;

            if(tempR==tempL){
                a[l]=a[tempL];
                a[tempL]=temp;
                break;
            }
            int here=a[tempL];
            a[tempL]=a[tempR];
            a[tempR]=here;
        }
        System.out.println(Arrays.toString(a));
        if(tempL-1>l) quickSort(a,l,tempL-1);
        if(tempL+1<r) quickSort(a,tempL+1,r);
    }
}

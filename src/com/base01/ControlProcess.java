package com.base01;

import java.util.Scanner;

public class ControlProcess {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*System.out.println("输入身高");
        float height=in.nextFloat();
        System.out.println("输入体重");
        float weight=in.nextFloat();
        double bmi=weight/(height*height);
        System.out.println(bmi);
        if (bmi<18.5) System.out.println("体重过轻");
        else if(bmi>=18.5&&bmi<24) System.out.println("正常体重");
        else if(bmi>=24&&bmi<27) System.out.println("体重过重");
        else if(bmi>=27&&bmi<30) System.out.println("轻度肥胖");
        else if(bmi>=30&&bmi<35) System.out.println("中度肥胖");
        else if(bmi>=35) System.out.println("重度肥胖");*/
        /*String month=in.nextLine();
        switch (month){
            case "january":
                System.out.println("一月");
                break;
            case "february":
                System.out.println("二月");
                break;
            default:
                System.out.println("^_^");
        }
        int i=in.nextInt();
        int res=1;
        while (i>0){
            res*=i;
            i--;
        }
        System.out.println(res);*/
        /*int year=1;
        while (true){
            double count=0;
            for(int i=1;i<=year;i++){
                count+=12000*Math.pow(1.2,i);
            }
            if(count>=1e6){
                System.out.println(count);
                System.out.println(year);
                break;
            }
            year++;
        }*/
        /*double a=0.618;
        double temp=100;
        double x=0,y=0;
        for (double i = 1; i <= 20; i++) {
            for (double j = 1; j <= 20; j++) {
                if(!(i%2==0&&j%2==0)&&i<j){
                    if(Math.abs(a-i/j)<temp){
                        temp=Math.abs(a-i/j);
                        x=i;
                        y=j;
                    }
                }
            }
        }
        System.out.println(x+" "+y+" "+x/y);*/
        /*for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if((i*100+j*10+k)==(Math.pow(i,3)+Math.pow(j,3)+Math.pow(k,3)))
                        System.out.println(i*100+j*10+k);
                }
            }
        }*/
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                for (int m = 0; m < 14; m++) {
                    for (int n = 0; n < 14; n++) {
                        if(i+j==8&&j+m==10&&n-m==6&&i+n==14){
                            System.out.println(i+" "+j+" "+m+" "+n);
                        }
                    }
                }
            }
        }
    }
}

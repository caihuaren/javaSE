package com.base01;

import java.util.Scanner;

public class FormatPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入地名");
        String place=in.nextLine();
        System.out.println("输入公司类型");
        String companyType=in.nextLine();
        System.out.println("输入老板名称");
        String boss=in.nextLine();
        System.out.println("输入公司名称");
        String companyName=in.nextLine();
        System.out.println("输入金额");
        String money=in.nextLine();
        System.out.println("输入产品");
        String product=in.nextLine();
        System.out.println("输入价格计量单位");
        String moneyType=in.nextLine();
        System.out.printf("%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%s个亿，" +
                "带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、三%s多的%s，" +
                "现在全部只卖二十块，统统只要二十块!%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不" +
                "发工资，你还我血汗钱，还我血汗钱!",place,companyType,companyName,boss,money,product,moneyType,moneyType,
                moneyType,product,boss);

    }
}

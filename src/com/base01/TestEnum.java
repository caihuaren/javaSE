package com.base01;

public class TestEnum {
    public static void main(String[] args) {
        Season season=Season.Autumn;
        for(Season s:Season.values()) {
            System.out.println(s);
            switch (s) {
                case Spring:
                    System.out.println("春天");
                    break;
                case Autumn:
                    System.out.println("秋天");
                    break;
                case Summer:
                    System.out.println("夏天");
                    break;
                case Winter:
                    System.out.println("冬天");
                    break;
            }
        }
    }
}

package com.bhq;

import java.util.Random;

public class TestEnum {
    public static void main(String[] args) {
//        System.out.println(jijie.SPRING);
//        System.out.println(Season.SPRING);
//        System.out.println(Season.SUMMER);
//
        for (Season s : Season.values()) {
            System.out.println(s);
        }
        int a = new Random().nextInt(4);
        switch (Season.values()[a]) {
            case AUTUMN:
                System.out.println("秋天");
                break;
            case SPRING:
                System.out.println("春天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;


        }


    }


}

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

//
//class jijie {
//    public static final int SPRING = 0;
//    public static final int SUMMER = 1;
//    public static final int AUTUMN = 2;
//    public static final int WINTER = 3;
//
//
//}
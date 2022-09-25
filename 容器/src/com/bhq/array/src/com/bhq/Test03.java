package com.bhq;

//测试遍历
public class Test03 {
    public static void main(String[] args) {
        String cities[] = {"北京", "上海", "广州", "太原"};
        for (int i = 0; i < cities.length; i++) {
            String t = cities[i];
            System.out.println(t);

        }
        System.out.println("*************");
        for (String t : cities
        ) {
            System.out.println(t);
        }

    }


}

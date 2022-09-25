package com.bhq;

//数组的三种初始化方式
public class Test02 {
    public static void main(String[] args) {
        //静态初始化
        int a[] = {1, 2, 3};
        Man[] mans = {new Man(20, 1), new Man(22, 2)};
        System.out.println(a[1]);
        System.out.println(mans[1].getAge());

        //默认初始化
        int a2[]=new int[2];//默认值0.0
        boolean b[]=new boolean[2];//false
        String c[]=new String[2];//默认值 null

    }


}

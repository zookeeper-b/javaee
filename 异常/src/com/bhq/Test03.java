package com.bhq;



//字符序列陷阱，时间和空间的效率测试
public class Test03 {
    public static void main(String[] args) {
        String str="";

        long num1 = Runtime.getRuntime().freeMemory();
        long time1 = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            str+=i ;

        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("占用内存"+(num1-num2));
        System.out.println("占用时间"+(time2-time1));

        StringBuilder sb1=new StringBuilder("");
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            sb1.append(i);

        }

        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("占用内存"+(num3-num4));
        System.out.println("占用时间"+(time4-time3));

    }


}

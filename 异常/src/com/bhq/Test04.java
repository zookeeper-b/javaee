package com.bhq;
//Date类的方法
import java.util.Date;

public class Test04 {
    public static void main(String[] args) {
        long nowNum=System.currentTimeMillis();
        System.out.println(nowNum);

        Date date1=new Date();
        System.out.println(date1);
        System.out.println(date1.getTime());


        Date date2=new Date(-21L*365*24*3600*1000-5*24*3600*1000);
        System.out.println(date2);
        System.out.println(date2.equals(date1));
        System.out.println(date2.before(date1));
        System.out.println(date2.after(date1));






    }









}

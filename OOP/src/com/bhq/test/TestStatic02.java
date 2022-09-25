package com.bhq.test;

public class TestStatic02 {
    static String company;
    static {
        System.out.println("执行了类的初始化工作");
        company = "bhq";
        printCompany();

    }
    public  static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {

    }


}

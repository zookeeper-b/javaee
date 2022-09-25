package com.bhq.test;

public class TestStatic {
    int id;
    String name;
    static String company = "山西农业大学";

    public TestStatic(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void login() {
        System.out.println(id);
        System.out.println(name);
    }

    public static void printCompany() {
        //调用非静态成员变量,编译就会报错
        System.out.println(company);
    }

    public static void main(String[] args) {
        TestStatic u = new TestStatic(101, "bhq");
        u.printCompany();
        u.company = "阿里爷爷";
        u.printCompany();
        u.login();
    }


}

package com.bhq.test;

public class USer {
    int id;
    int age;
    String name;
    String pwd;

    public void showname() {
        System.out.println(name);
    }

    public void showage() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        USer u1 = new USer();
        u1.age = 24;
        u1.name = "张三";
        u1.showname();
        u1.showage();

        USer u2 = new USer();
        u2.age = 35;
        u2.name = "李四";
        u2.showname();
        u2.showage();

        USer u3 = u1;
        USer u4 = u1;
        u3.age = 19;
        u1.showage();
        System.out.println(u4.age);
    }

}

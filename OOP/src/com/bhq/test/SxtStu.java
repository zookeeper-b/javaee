package com.bhq.test;

public class SxtStu {
    int id;
    int age;
    String sname;

    public void study() {
        System.out.println("学习");
    }

    public void kickball() {
        System.out.println("踢球");

    }

    public static void main(String[] args) {
        SxtStu s1 = new SxtStu();
        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.sname);
        s1.id = 19;
        s1.age = 20;
        s1.sname = "白汉淇";
        s1.kickball();
        s1.study();
        System.out.print("学号\t" + s1.id + "\n");
        System.out.print("年龄\t" + s1.age + "\n");
        System.out.print("名字\t" + s1.sname + "\n");

    }
}

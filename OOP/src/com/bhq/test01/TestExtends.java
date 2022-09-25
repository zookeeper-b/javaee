package com.bhq.test01;

public class TestExtends {
    public static void main(String[] args) {
        Student s1 = new Student("bhq", 181, "IT");
        System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof Person);
        s1.rest();
        s1.study();
        System.out.println(s1.height);
        s1.height = 190;
        System.out.println(s1.height);
        System.out.println(s1.name);
    }

}

class Person {
    String name;
    int height;

    public void rest() {
        System.out.println("休息");
    }
}

class Student extends Person {
    String major;

    public void study() {
        System.out.println("学习");

        System.out.println(this.name);
    }

    public Student(String name, int height, String major) {
        this.name = name;
        this.height = height;
        this.major = major;
    }

}

class Boy extends Person {


}




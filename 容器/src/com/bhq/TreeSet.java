package com.bhq;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.TreeSet<>();
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("a");
        for (String str : set
        ) {
            System.out.println(str);
        }
        System.out.println("----------------");
        Set<Users> set1 = new java.util.TreeSet<>();
        Users u = new Users("bhq", 18);
        Users u1 = new Users("lxy", 22);
        Users u2 = new Users("asxt", 22);
        set1.add(u);
        set1.add(u1);
        set1.add(u2);

        for (Users user : set1
        ) {
            System.out.println(user);
        }
        System.out.println("_______________________");
        Set<Student> set2=new java.util.TreeSet<>(new StudentComparator());
        Student s=new Student("bhq",12);
        Student s1=new Student("LXY",18);
        Student s2=new Student("Asxt",18);
        set2.add(s);
        set2.add(s1);
        set2.add(s2);

        for (Student stu:set2
             ) {
            System.out.println(stu);
        }






    }

}

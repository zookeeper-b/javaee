package com.bhq;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        //实例化treemap
        Map<Users, String> map = new TreeMap<>();
        Users u1 = new Users("bhq", 18);
        Users u2 = new Users("lxy", 19);
        map.put(u1, "old");
        map.put(u2, "add");
        Set<Users> keys = map.keySet();
        for (Users users : keys) {
            System.out.println(users + "," + map.get(users));

        }
        System.out.println("-------------------");
        Map<Student, String> treeMap = new TreeMap<>(new StudentComparator());
        Student s1 = new Student("bhq", 18);
        Student s2 = new Student("lxy", 22);
        Student s3 = new Student("sxt", 22);
        treeMap.put(s1, "bhq");
        treeMap.put(s2, "lxy");
        treeMap.put(s3, "sxt");

        Set<Student> keys1 = treeMap.keySet();
        for (Student stu : keys1
        ) {
            System.out.println(stu + "," + treeMap.get(stu));
        }


    }
}

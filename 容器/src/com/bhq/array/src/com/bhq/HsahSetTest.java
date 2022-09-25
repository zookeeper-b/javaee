package com.bhq;

import java.util.HashSet;
import java.util.Set;

public class HsahSetTest {
    public static void main(String[] args) {
        //实例化HashSet
        Set<String> set=new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("a");

        for (String str:set
             ) {
            System.out.println(str);
        }
        System.out.println("--------------");
       boolean flag =set.remove("c");
        for (String str:set
        ) {
            System.out.println(str);
        }
        System.out.println(flag);

        System.out.println("--------------");
        int size=set.size();
        System.out.println(size);
        System.out.println("--------------");

        Set<Users> set1=new HashSet<>();

        Users u=new Users("BHQ",18);
        Users u1=new Users("BHQ",18);
        Users u2=new Users("LXY",18);

        set1.add(u);
        set1.add(u1);
        set1.add(u2);
        System.out.println(u.hashCode());
        System.out.println(u1.hashCode());


        for (Users users:set1
             ) {
            System.out.println(users);
        }

    }
}

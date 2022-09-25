package com.bhq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("e");
        list.add("c");

        Collections.sort(list);

        for (String str:list
             ) {
            System.out.println(str);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        List<String> list1=new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        Collections.shuffle(list1);
        for (String str:list1
        ) {
            System.out.println(str);
        }

    }


}

package com.bhq;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

       for (int i=0;i<list.size();i++){
           System.out.println(list.get(i));
       }
        System.out.println("-----------------------");
        for (String str:list
             ) {
            System.out.println(str);
        }

    }
}

package com.bhq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);

        }
        System.out.println("-------------------------");
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String value = it.next();
            System.out.println(value);

        }


    }


}


package com.bhq;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListDemo {
    public static void main(String[] args) {
        System.out.println("---------Arraylist无序排序---------");
        List<Integer> list = new ArrayList<>();
        while (true) {
            int num = (int) (Math.random() * 10 + 1);

            if (!list.contains(num)) {
                list.add(num);
            }
            if (list.size() == 10) {
                break;
            }


        }
        for (Integer i : list
        ) {
            System.out.println(i);
        }


        System.out.println("---------TreeSet有序排序---------");

        Set<Integer> set = new TreeSet<>();
        while (true) {
            int num = (int) (Math.random() * 10 + 1);


                set.add(num);

            if (set.size() == 10) {
                break;
            }


        }
        for (Integer i : set
        ) {
            System.out.println(i);
        }


    }


}

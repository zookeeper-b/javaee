package com.bhq;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        while (true) {
            int num = (int) (Math.random() * 10 + 1);
            set.add(num);
            if (set.size()==10){
                break;
            }


        }
        for (Integer i:set
             ) {
            System.out.println(i);
        }



    }
}

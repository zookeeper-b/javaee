package com.bhq;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorSetTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("d");
        set.add("e");
        //
        Iterator<String> integer=set.iterator();

        while (integer.hasNext()){
            String value=integer.next();
            System.out.println(value);

        }
        System.out.println("-----------------");
        for (Iterator<String> i= set.iterator();i.hasNext();){
            String value= i.next();
            System.out.println(value);

        }


    }


}

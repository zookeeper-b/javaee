package com.bhq;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
//        List<String> list=new ArrayList<>();
//        boolean flag=list.add("baihanqi");
//        boolean flag2=list.add("baihanqi");
//
//
//        System.out.println(flag);
//
//        list.add(2,"oidbai");


        List<String> list=new ArrayList<>();
        boolean flag = list.add("bhq");
        boolean lxy = list.add("lxy");
        System.out.println(lxy);
        System.out.println(flag);
        System.out.println("ArrayListTest.main");
        String s = list.get(0);
        String s1= list.get(1);
        System.out.println(s);
        System.out.println(s1);

        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        List newList = list1;
        newList.add(1);
        System.out.println(newList);
    }



}

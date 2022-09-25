package com.bhq;

import java.util.LinkedList;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        boolean flag = list.add("bhq");
        boolean fla2 = list.add("asd");
        System.out.println(flag);
        System.out.println(fla2);

        list.add(1, "olala");
        list.add("sadasdasdsadasdasdasd");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        System.out.println("============(list.size)容器元素个数=============");
        String value = list.remove(1);
        System.out.println(value);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("==========删除=============");

        boolean flag3 = list.remove("bhq");
        System.out.println(flag3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------替换----------");

        String val = list.set(0, "lxy");
        System.out.println(val);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("--------清空容器--------");
//        list.clear();
//        System.out.println(list.size());

        System.out.println("--------判断容器是否为空--------");
        list.add("213123");
        list.add("bhqlove");
        boolean flag4 = list.isEmpty();
        System.out.println(flag4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------判断容器是否包含指定元素--------");
        boolean flag5 = list.contains("bhq");
        System.out.println(flag5);

        System.out.println("--------查找元素的位置--------");
        int flag6 = list.indexOf("lxy");
        System.out.println(flag6);
        int flag7 = list.lastIndexOf("213123");
        System.out.println();
        System.out.println(flag7);

        System.out.println("--------将单例集合装换为数组--------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("ArrayList.main");
        Object[] arr = list.toArray();

        for (int i = 0; i < arr.length; i++) {
            String str = (String) arr[i];
            System.out.println(str);
        }
        System.out.println("--------将单例集合装换为数组<T> T--------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        String array[] = list.toArray(new String[list.size()]);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("--------容器的并集操作--------");
        List<String> a = new java.util.ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        List<String> b = new java.util.ArrayList<>();
        b.add("b");
        b.add("c");

        boolean flag8 = a.addAll(b);
        System.out.println(flag8);
        for (String str : a) {
            System.out.println(str);
        }
        System.out.println("--------容器的交集操作--------");

        List<String> a1 = new java.util.ArrayList<>();
        a1.add("a");
        a1.add("c");
        a1.add("d");

        List<String> b1 = new java.util.ArrayList<>();
        b1.add("a");
        b1.add("b");
        b1.add("c");
        boolean flag9 = a1.retainAll(b1);
        System.out.println(flag9);
        for (String str : a1) {
            System.out.println(str);
        }

        System.out.println("--------容器的差集操作--------");
        List<String> c = new java.util.ArrayList<>();
        c.add("a");
        c.add("d");
        c.add("e");

        boolean flag10 = c.removeAll(b1);
        System.out.println(flag10);
        for (String str : c) {
            System.out.println(str);
        }
        System.out.println("----------LinkedList------------");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("a");
        linkedList.addFirst("b");
        linkedList.addFirst("c");

        for (String str : linkedList
        ) {
            System.out.println(str);
        }
        System.out.println("----------LinkedList------------");
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.addLast("e");
        linkedList.addLast("f");


        for (String str : linkedList
        ) {
            System.out.println(str);
        }

        linkedList.pop();
        for (String str : linkedList
        ) {
            System.out.println(str);
        }

    }


}

package com.bhq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        int flag;
        for (int i = 0; i < list.size(); i++) {
            if ("c".equals(list.get(i))) {
                flag = i;
                if (flag > -1) {
                    list.remove(flag);
                }


            }

            System.out.println(list.get(i));
        }
        System.out.println("---------------");
        for (String str : list
        ) {
            if ("c".equals(str))
                list.remove(str);
            System.out.println(str);
        }
        System.out.println("================");
        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String v = iterator.next();
            if ("c".equals(v)) {
                iterator.remove();
            }
        }
        for (Iterator<String> it=list.iterator();it.hasNext();){
            System.out.println(it.next());
        }
    }


}




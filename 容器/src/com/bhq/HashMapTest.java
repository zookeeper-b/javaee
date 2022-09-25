package com.bhq;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "A");
        String value = map.put("a", "B");

        System.out.println(value);

        System.out.println("--------map.get获取-------");
        String val = map.get("a");
        System.out.println(val);


        System.out.println("------------keySet+get获取-------");
        map.put("b", "B");
        map.put("c", "C");
        map.put("d", "D");
        map.put("e", "E");

        Set<String> keys = map.keySet();
        for (String key : keys
        ) {
            String v1 = map.get(key);
            System.out.println(key + "---" + v1);
        }
        System.out.println("------------entrySet获取-------");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String v = entry.getValue();
            System.out.println(key + "，" + v);
        }
        System.out.println("-------------------");
        Map<String, String> map2 = new HashMap<>();
        map2.put("f", "F");
        map2.put("c", "CC");
        map2.putAll(map);
        Set<String> key2 = map2.keySet();
        for (String key : key2
        ) {
            String v2 = map2.get(key);
            System.out.println(key + "," + v2);
        }
        System.out.println("-------------------");
        String v = map.remove("e");
        System.out.println(v);
        Set<String> key3 = map.keySet();
        for (String key : key3
        ) {
            System.out.println(key + "," + map.get(key));
        }
        System.out.println("-------------------");
        boolean flag = map.containsKey("a");
        System.out.println(flag);
        boolean value1 = map.containsValue("g");
        System.out.println(value1);


    }


}

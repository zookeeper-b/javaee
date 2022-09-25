package com.bhq.test;

import java.util.Locale;

public class StringTest2 {
    public static void main(String[] args) {
        String s = " ";
        String s1 = "how are you?";
        System.out.println(s1.startsWith("how"));
        System.out.println(s1.endsWith("you"));
        s = s1.substring(4);
        System.out.println(s);
        s = s1.substring(4, 7);
        System.out.println(s);
        s = s1.toLowerCase();
        System.out.println(s);
        s = s1.toUpperCase();
        System.out.println(s);
        String s2 = "  how old are you!!   ";
        s = s2.trim();
        System.out.println(s);
        System.out.println(s2);



    }


}

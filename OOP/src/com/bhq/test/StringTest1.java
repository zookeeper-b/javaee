package com.bhq.test;

public class StringTest1 {

    public static void main(String[] args) {
        String s1 = "core java";
        String s2 = "Core java";

        System.out.println(s1.charAt(3));
        System.out.println(s2.length());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.indexOf("java"));
        System.out.println(s1.indexOf("apple"));
//        System.out.println(s1.getBytes());
//        System.out.println(s2.split(s1));

        String s=s1.replace(' ','&');
        System.out.println("result is:"+s);

        String s3="l love java,java is best language";
        System.out.println(s3.indexOf("java"));
        System.out.println(s3.lastIndexOf("java"));



    }


}

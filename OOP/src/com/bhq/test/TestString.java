package com.bhq.test;

public class TestString {
    public static void main(String[] args) {
        String s0=null;
        String s1="";
        String s2="java";
        String s3=new String("java");
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println("===================");
        String s5="bhq";
        String s4="bhq";
        String s6=new String("bhq");
        System.out.println(s4==s5);
        System.out.println(s4==s6);
        System.out.println(s4.equals(s6));
        System.out.println(s5.equals(s6));
        //equals比较内容是否相等，也就是说比较字符是否相等，而不是内容和来源（也就是指针指向路径是是否相同）

    }



}

package com.bhq;

public class StringTest {
    //    String str="abc";
//    StringBuffer sb2=new StringBuffer("abc");
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        StringBuffer sb2 = new StringBuffer("北京尚学堂");
        for (int i = 0; i < 7; i++) {
            sb.append((char) ('a' + i));

        }
        System.out.println(sb.toString());
        sb.append("I am bhq");
        System.out.println(sb.toString());

        sb2.insert(0, "爱").insert(0, "我");
        System.out.println(sb2);
        sb2.delete(0, 2);
        System.out.println(sb2);
        sb2.deleteCharAt(0).deleteCharAt(0);
        System.out.println(sb2.charAt(0));
        System.out.println(sb2.reverse());


    }


}

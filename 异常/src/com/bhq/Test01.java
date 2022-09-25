package com.bhq;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("111");

        int b = 0;
        if (b != 0) {
            System.out.println(1 / b);

        }
        String str = null;
        if (str != null) {
            System.out.println(str.charAt(0));
        }
        A a=new C();
        if (a instanceof D){
            D d=(D)a;
        }
        String str2="1231fsdda";
        Pattern p =Pattern.compile("^\\d+$");
        Matcher m=p.matcher(str2);
        if (m.matches()){
            System.out.println(Integer.parseInt(str2));

        }


    }

}

class A {

}

class C extends A {

}

class D extends A {

}




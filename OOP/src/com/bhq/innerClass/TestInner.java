package com.bhq.innerClass;

public class TestInner {
    public static void main(String[] args) {
        Outer.Inner i=new Outer().new Inner();
        i.show();


    }



}

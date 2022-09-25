package com.bhq.innerClass;

public class Outer2 {
    private int a = 10;
    private static int b = 20;

    static class Inner2 {
        public void test() {
            System.out.println(b);
        }
    }
}

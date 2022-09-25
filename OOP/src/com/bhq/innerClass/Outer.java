package com.bhq.innerClass;

public class Outer {
    private int age = 10;

    public void show() {
        System.out.println("Outer.show");
        System.out.println(age);


    }
    public void rid() {

        System.out.println("Outer.rid");

    }

    public class Inner {
        private int age = 20;

        public void show() {
            System.out.println("Inner.show");
            System.out.println(age);
            System.out.println(Outer.this.age);
            Outer.this.show();
            Outer.this.rid();
        }

    }
}

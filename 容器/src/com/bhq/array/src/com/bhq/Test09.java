package com.bhq;

import java.util.Arrays;

public class Test09 {
    public static void main(String[] args) {
        Man2[] msMans = {
                new Man2(3, "a"),
                new Man2(60, "b"),
                new Man2(2, "c")
        };
        System.out.println(msMans[0]);
        System.out.println(Arrays.toString(msMans));
        Arrays.sort(msMans);
        System.out.println(Arrays.toString(msMans));
    }
}

class Man2 implements Comparable {
    int age;
    int id;
    String name;

    public Man2(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + "  "+age ;
    }

    @Override
    public int compareTo(Object o) {
        Man2 man2 = (Man2) o;
        if (this.age < man2.age) {
            return -1;

        }
        if (this.age > man2.age) {
            return 1;

        }

        return 0;
    }


}
package com.bhq;

public class test {
    public static void main(String[] args) {

        Generic<String> generic = new Generic<>();
        generic.setFlag("admin");
        String flag = generic.getFlag();
        System.out.println(flag);


        Generic<Integer> generic1 = new Generic<>();
        generic1.setFlag(100);
        Integer flag1 = generic1.getFlag();
        System.out.println(flag1);


        Generic<Double> generic2 = new Generic<>();
        generic2.setFlag(123.343534);
        Double flag2 = generic2.getFlag();
        System.out.println(flag2);


    }


}

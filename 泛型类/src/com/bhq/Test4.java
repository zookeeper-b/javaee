package com.bhq;

public class Test4 {
    public static void main(String[] args) {
        MethodGeneric.setFlag("odibai");
        MethodGeneric.setFlag(123123);
        String flag = MethodGeneric.getFlag("白汉淇");
        System.out.println(flag);
        Integer flag1 = MethodGeneric.getFlag(1311321);
        System.out.println(flag1);

    }


}

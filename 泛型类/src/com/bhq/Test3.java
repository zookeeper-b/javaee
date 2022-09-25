package com.bhq;

public class Test3 {
    public static void main(String[] args) {
        MethodGeneric methodGeneric = new MethodGeneric();
        methodGeneric.setName("oidba123i");
        methodGeneric.setName(123123123);
        methodGeneric.setName(123.213123);

        System.out.println("--------------");
        System.out.println(" ");
        MethodGeneric methodGeneric2 = new MethodGeneric();
        String name=methodGeneric2.getName("白汉淇");
        String name2=methodGeneric2.getName("123123");
        Integer name1=methodGeneric2.getName(1231231);
        System.out.println(name2);
        System.out.println(name1);
        System.out.println(name);

    }


}

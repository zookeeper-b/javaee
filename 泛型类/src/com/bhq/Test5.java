package com.bhq;

public class Test5 {


    public static void main(String[] args) {
        MethodGeneric methodGeneric = new MethodGeneric();
        String arr[] = new String[]{"a", "b", "c"};
        methodGeneric.method(arr);
        Integer arr1[] = new Integer[]{1231, 2324, 3423};
        methodGeneric.method(arr1);
    }


}

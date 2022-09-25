package com.bhq.testInterface;

public interface TestDefault {
    void printInfo();

    default void moren() {
        System.out.println("TestDefault.moren");
        System.out.println("测试默认方法");
        testStatic01();

    }
    public static void testStatic01(){
        System.out.println("TestDefault.testStatic01");
    }

}

class TestDefaultImpl01 implements TestDefault {


    @Override
    public void printInfo() {
        System.out.println("TestDefaultImpl01.printInfo");
    }
    public static void testStatic01(){
        System.out.println("TestDefaultImpl01.testStatic01");
    }

}
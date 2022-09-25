package com.bhq.testInterface;

public class Test {
    public static void main(String[] args) {
        Angel a =new Angel();
        a.fly();
        a.helpOther();
        System.out.println(Volant.Fly_Hight);

        Volant a2=new Angel();
        a2.fly();
        ((Angel) a2).helpOther();

        System.out.println("=======测试默认方法========");
        TestDefault td=new TestDefaultImpl01();
        td.printInfo();
        td.moren();
        System.out.println(".......测试静态方法.........");
        TestDefault.testStatic01();
        TestDefaultImpl01.testStatic01();

    }

}

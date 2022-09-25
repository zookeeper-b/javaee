package com.bhq.test01;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Objects;

public class TestObject extends Object {
    int id;
    String name;
    String pwd;

    public TestObject(int id,String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public TestObject() {

    }


//    @Override
//    public String toString() {
//        return "账户名：白汉淇" + name + "密码123" + pwd;
//    }

    public static void main(String[] args) {
//        TestObject t = new TestObject();
//        System.out.println(t.toString());
//        TestObject t2 = new TestObject();
//        System.out.println(t2.toString());
//        System.out.println(t2);//默认toString方法
//        System.out.println("TestObject.main");
        TestObject t3= new TestObject(1001,"BHQ","123456");
        TestObject t4= new TestObject(1001,"BHQ","123456");
        System.out.println(t3.toString());
        System.out.println(t4.toString());
        System.out.println(t3.equals(t4));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObject that = (TestObject) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(pwd, that.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pwd);
    }
}

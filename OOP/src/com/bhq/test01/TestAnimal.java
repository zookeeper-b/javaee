package com.bhq.test01;

public class TestAnimal {
    public static void main(String[] args) {
//        animalCry(new Dog());
//        animalCry(new Cat());

        //编译类型  运行类型
        Animal animal = new Dog();//向上转型
        animal.shut();
        Dog dog = (Dog) animal;//向下转型
        dog.seeDoor();
    }

    static void animalCry(Animal a) {
        System.out.println("测试多态");
        a.shut();

    }


}

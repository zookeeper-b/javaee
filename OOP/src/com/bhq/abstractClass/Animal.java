package com.bhq.abstractClass;

public abstract class Animal {
    int age;
    public abstract void rest();
    public abstract void run();
    public  void shut(){
        System.out.println("Animal.shut");
//        Animal animal=new Animal() {

    };





}
class Dog extends Animal{

    @Override
    public void rest() {
        System.out.println("Dog.rest");
    }

    @Override
    public void run() {
        System.out.println("Dog.run");
    }
}
class Cat extends Animal{


    @Override
    public void rest() {
        System.out.println("Cat.rest");
    }

    @Override
    public void run() {
        System.out.println("Cat.run");
    }
}
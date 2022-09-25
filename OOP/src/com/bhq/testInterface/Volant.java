package com.bhq.testInterface;

public interface Volant {
/*public static final */    int Fly_Hight=100;
/*public abstract */     void fly();



}
//善良接口
interface Honest{
    void helpOther();

}
class GoodMan implements Honest{


    @Override
    public void helpOther() {
        System.out.println("扶老奶奶过马路");
    }
}
class BirdMan implements Volant{


    @Override
    public void fly() {
        System.out.println("我在飞");
    }
}

class Angel implements Volant,Honest{


    @Override
    public void fly() {
        System.out.println("Angel.fly");
    }

    @Override
    public void helpOther() {
        System.out.println("Angel.helpOther");
    }
}
class Plane implements Volant{

    @Override
    public void fly() {
        System.out.println("飞机飞啊");
    }
}

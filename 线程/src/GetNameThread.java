class GetName1 extends Thread {
    @Override
    public void run() {
        System.out.println(this.getName());
        System.out.println("GetName1.run");
    }
}

class GetName2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("GetName2.run");
    }
}

public class GetNameThread {
    public static void main(String[] args) {

        GetName2 getName2 = new GetName2();
        Thread t = new Thread(getName2);
        t.start();
        GetName1 getName1 = new GetName1();
        getName1.start();

    }
}

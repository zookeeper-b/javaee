public class SetNameThread {
    public static void main(String[] args) {
//        SetName1 setName1 = new SetName1();
//        setName1.setName("bhq");
//        setName1.start();

        Thread thread = new Thread(new SetName2());
        thread.setName("s2");
        thread.start();
    }
}

class SetName1 extends Thread {


    @Override
    public void run() {
        System.out.println(this.getName());
    }
}

class SetName2 implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

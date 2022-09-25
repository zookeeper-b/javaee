public class DemoThread {
    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(new Demo(), "bhq");
        Thread t1 = new Thread(new UserThread(), "lxy");
        t1.start();
//        t.setDaemon(true);
//        t.start();
        Thread.sleep(1000);
        System.out.println("主线程结束");


    }
}

class Demo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class UserThread implements Runnable {
    @Override
    public void run() {
        Thread t = new Thread(new Demo(), "bhq");

        t.setDaemon(true);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
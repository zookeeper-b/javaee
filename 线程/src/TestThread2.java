public class TestThread2 implements Runnable {
    public TestThread2() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("主线程开始");

        Thread t1 = new Thread(new TestThread2());
        Thread t2 = new Thread(new TestThread2());

        //启动线程
        t1.start();
        t2.start();
        System.out.println("主线程结束");


    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始");
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println(Thread.currentThread().getName() + "线程结束");
    }
}

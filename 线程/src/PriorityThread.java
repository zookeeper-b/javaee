public class PriorityThread {
    public static void main(String[] args) throws InterruptedException {
        long l1 = System.currentTimeMillis();
        Priority p1 = new Priority();
        Priority p2 = new Priority();
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p1);
        t1.setName("lxy");
        t2.setName("bhq");

        System.out.println(t1.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        Thread.sleep(1000);
        p1.stop();
        p2.stop();
        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1);
    }

}

class Priority implements Runnable {
    private int num;
    private boolean flag = true;

    @Override
    public void run() {
        while (this.flag) {
            System.out.println(Thread.currentThread().getName() + "" + num++);
        }
    }

    public void stop() {
        this.flag = false;
    }


}

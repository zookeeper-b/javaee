import java.io.IOException;

public class StopTread implements Runnable {
    private boolean flag = true;

    public static void main(String[] args) throws IOException {
        System.out.println(Thread.currentThread().getName() + "线程开始");
        StopTread st = new StopTread();
        Thread t1 = new Thread(st);
        t1.start();
        System.in.read();
        st.stop();

        System.out.println(Thread.currentThread().getName() + "线程开始");

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始");
        int i = 0;
        while (flag) {
            System.out.println(Thread.currentThread().getName() + i++);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println(Thread.currentThread().getName() + "线程结束");
    }

    public void stop() {
        this.flag = false;
    }
}

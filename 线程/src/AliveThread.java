public class AliveThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Alive());
        System.out.println(thread.isAlive() + "1");
        thread.start();
        System.out.println(thread.isAlive() + "3");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.isAlive() + "4");
    }
}

class Alive implements Runnable {
    @Override
    public void run() {

        System.out.println(Thread.currentThread().isAlive() + "2");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
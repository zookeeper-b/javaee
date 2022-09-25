public class ProduceThread {
    public static void main(String[] args) {
        SyncStack syncStack = new SyncStack();
        new SC(syncStack).start();
        new XF(syncStack).start();
    }
}

class Mantou {
    private int id;

    public Mantou(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}

class SyncStack {
    private Mantou[] mt = new Mantou[10];
    private int index;

    public synchronized void push(Mantou mantou) {
        while (this.index == this.mt.length) {
            try {
                this.wait();//wait 执行后回将持有的对象锁释放，并进入阻塞状态，其他需要该对象锁的线程就继续运行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //唤醒消费者线程
        this.notify();
        this.mt[this.index] = mantou;
        this.index++;
    }

    public synchronized Mantou pop() {
        while (this.index == 0) {
            try {
                this.wait();//wait 执行后回将持有的对象锁释放，并进入阻塞状态，其他需要该对象锁的线程就继续运行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        this.index--;
        return this.mt[this.index];
    }


}

class SC extends Thread {
    private SyncStack ss;

    public SC(SyncStack ss) {
        this.ss = ss;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("生产馒头" +( i+1) + "个");
            Mantou mantou = new Mantou(i);
            this.ss.push(mantou);
        }
    }
}

class XF extends Thread {
    private SyncStack ss;

    public XF(SyncStack ss) {
        this.ss = ss;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Mantou mantou = this.ss.pop();
            System.out.println("消费馒头" + (i +1)+ "个");


        }
    }
}
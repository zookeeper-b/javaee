public class DeadLockThread {
    public static void main(String[] args) {
        Makeup makeup = new Makeup();
        makeup.setFlag(0);
        makeup.setGname("bhq");
        makeup.start();
        Makeup makeup1 = new Makeup();
        makeup1.setFlag(1);
        makeup1.setGname("lxy");
        makeup1.start();
//
//        Thread thread=new Thread(makeup);
//        Thread thread1=new Thread(makeup1);
//        thread.start();
//        thread1.start();

    }
}

class Lipstick {


}

class Mirror {

}

class Makeup extends Thread {
    private int flag;
    private String gname;
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    public void setFlag(int flag) {
        this.flag = flag;
    }


    public void setGname(String name) {
        this.gname = name;
    }

    @Override
    public void run() {
        this.doMakeup();
    }

    public void doMakeup() {
        if (flag == 0) {
            synchronized (lipstick) {
                System.out.println(this.gname + "拿着口红");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (mirror) {
                    System.out.println(this.gname + "拿着镜子");
                }

            }
        } else {
            synchronized (mirror) {
                System.out.println(this.gname + "拿着镜子");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (lipstick) {
                System.out.println(this.gname + "拿着口红");
            }

        }
    }

}

public class Test3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"开始");
        new Thread(()->{
            for (int i=0;i<20;i++){
                System.out.println("Test3.main");
                System.out.println(Thread.currentThread().getName()+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"lambda thread").start();



        System.out.println(Thread.currentThread().getName()+"结束");



    }
}

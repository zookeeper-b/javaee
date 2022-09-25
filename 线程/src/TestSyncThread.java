public class TestSyncThread {
    public static void main(String[] args) {

//        Programmer programmer = new Programmer("bhq");
//        new working1(programmer).start();
//        new working2(programmer).start();
//        Programmer programmer = new Programmer("bhq");
//        Programmer programmer1 = new Programmer("lxy");
//        new wc(programmer).start();
//        new wc(programmer1).start();
//        Programmer programmer = new Programmer("bhq1");
//        Programmer programmer1 = new Programmer("lxy1");
//        new ProgrammerMoney(programmer).start();
//        new ProgrammerMoney(programmer1).start();
//        Sale sale = new Sale("bhq2");
//        Sale sale1 = new Sale("lxy2");
//        new SaleMoneyThread(sale).start();
//        new SaleMoneyThread(sale1).start();
        Manager manager = new Manager("bhq");
        new CheersThread("lxy23", manager).start();
        new CheersThread("lyw", manager).start();


    }
}

class Programmer {
    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    public void computer() {
        synchronized (this) {
            try {
                System.out.println(this.name + "接通电源");
                Thread.sleep(500);
                System.out.println(this.name + "按开机按键");
                Thread.sleep(500);
                System.out.println(this.name + "系统启动中");
                Thread.sleep(500);
                System.out.println(this.name + "系统启动成功");

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }

    }


    synchronized public void coding() {


        try {
            System.out.println(this.name + "双击idea");
            Thread.sleep(500);
            System.out.println(this.name + "idea启动成功");
            Thread.sleep(500);
            System.out.println(this.name + "写代码中");

        } catch (InterruptedException e) {
            e.printStackTrace();


        }
    }

    public void wc() {
        synchronized ("sad") {
            try {
                System.out.println(this.name + "打开卫生间门");
                Thread.sleep(500);
                System.out.println(this.name + "开始排泄");
                Thread.sleep(500);
                System.out.println(this.name + "冲水");
                Thread.sleep(500);
                System.out.println(this.name + "离开卫生间");
            } catch (InterruptedException e) {
                e.printStackTrace();


            }

        }
    }

    public void money() {
        synchronized (Programmer.class) {
            try {
                System.out.println(this.name + "被领导表扬");
                Thread.sleep(500);
                System.out.println(this.name + "拿钱");
                Thread.sleep(500);
                System.out.println(this.name + "对公司表示感谢");
                Thread.sleep(500);
                System.out.println(this.name + "开开心心的拿钱走人");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class working1 extends Thread {
    private Programmer programmer;

    public working1(Programmer programmer) {
        this.programmer = programmer;
    }


    @Override
    public void run() {
        this.programmer.computer();

    }
}

class working2 extends Thread {
    private Programmer programmer;

    public working2(Programmer programmer) {
        this.programmer = programmer;
    }


    @Override
    public void run() {
        this.programmer.coding();

    }
}

class wc extends Thread {
    private Programmer programmer;

    public wc(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void run() {
        this.programmer.wc();
    }
}

class ProgrammerMoney extends Thread {

    private Programmer programmer;

    public ProgrammerMoney(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void run() {
        this.programmer.money();
    }

}

class Sale {
    private String name;

    public Sale(String name) {
        this.name = name;
    }

    public void money() {
        synchronized (Sale.class) {
            try {
                System.out.println(this.name + "被领导表扬");
                Thread.sleep(500);
                System.out.println(this.name + "拿钱");
                Thread.sleep(500);
                System.out.println(this.name + "对公司表示感谢");
                Thread.sleep(500);
                System.out.println(this.name + "开开心心的拿钱走人");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

class SaleMoneyThread extends Thread {
    private Sale sale;

    public SaleMoneyThread(Sale sale) {
        this.sale = sale;
    }

    @Override
    public void run() {
        this.sale.money();
    }

}

class Manager {
    private String name;

    public Manager(String name) {

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void cheers(String mName, String eName) {

        try {
            System.out.println(mName + "来到" + eName + "面前");
            Thread.sleep(500);
            System.out.println(eName + "拿起酒杯");
            Thread.sleep(500);
            System.out.println(mName + "和" + eName + "干杯");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class CheersThread extends Thread {
    private Manager manager;
    private String name;

    public CheersThread(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    @Override
    public void run() {
        synchronized (manager) {
            this.manager.cheers(this.manager.getName(), name);
        }
    }
}
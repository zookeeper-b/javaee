import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输如你的月薪");
            double salary = scanner.nextInt();//月薪
            double jiao = salary - 5000;//应缴纳所得税
            double shui = 0;//应缴税额
            if (jiao < 0) {
                System.out.println("个人征税起点为5000元，不需要纳税");
            } else if (jiao <= 3000) {
                shui = jiao * 0.03;
                salary = salary - shui;
            } else if (jiao <= 12000) {
                shui = jiao * 0.1 - 210;
                salary = salary - shui;
            } else if (jiao <= 35000) {
                shui = jiao * 0.2 - 1410;
                salary = salary - shui;
            } else if (jiao <= 55000) {
                shui = jiao * 0.25 - 2660;
                salary = salary - shui;
            } else if (jiao <= 80000) {
                shui = jiao * 0.32 - 4410;
                salary = salary - shui;
            } else {
                shui = jiao * 0.45 - 15160;
                salary = salary - shui;
            }
            System.out.println("应缴纳所得税：" + jiao + "元\t" + "缴纳税额" + shui + "元\t" + "实发工资" + salary + "元\t");
            System.out.println("输入1退出程序！其他继续进行计算");
            int cmd = scanner.nextInt();

            if (cmd == 1) {
                System.out.println("程序结束");
                break;
            } else {
                continue;
            }
        }


    }
}

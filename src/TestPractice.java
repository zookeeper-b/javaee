import java.util.Scanner;

/**
 * 薪水计算器
 */
public class TestPractice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("*****我的薪水计算器*****");
        System.out.println("1.输入88，退出程序\n2.输入66，计算下一个年薪");


        while (true) {
            System.out.println("输入月薪");
            int monthSalary = s.nextInt();
            System.out.println("请输入一年几个月薪资");
            int months = s.nextInt();
            int yearSalary = monthSalary * months;
            System.out.println("年薪是：" + yearSalary);

            if (yearSalary >= 20000) {
                System.out.println("恭喜你成功超越%98的国人");
            } else if ((yearSalary >= 10000)) {
                System.out.println("恭喜你成功超越%90的国人");
            }
            System.out.println("1.输入88，退出程序\n2.输入66，计算下一个年薪");
            int com = s.nextInt();
            if (com == 88) {
                System.out.println("系统退出！");
                break;
            }
            if (com == 66) {
                System.out.println("计算下一个年薪！");
                continue;
            }
        }


    }
}

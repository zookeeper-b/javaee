public class TestMethod02 {
    public static void main(String[] args) {
   int a= handleLate(25,8000);
        System.out.println();
   int b= handleLate(15,18000);
        System.out.println();
   int c= handleLate(65,28000);

    }

    public static int handleLate(int lateMinute, int monthsalary) {
        int fakuan = 0;
        int daysalary = (int) (monthsalary / 22.5);
        System.out.println("迟到分钟数" + lateMinute);
        System.out.println("月薪" + monthsalary);
        if (lateMinute < 10) {
            System.out.println("警告!");
        } else if (lateMinute <= 20) {
            System.out.println("罚款100元");
            fakuan = 100;
        } else if (lateMinute <= 30) {
            System.out.println("罚款200元");
            fakuan = 200;
        } else if (lateMinute <= 60) {
            System.out.println("罚款半日工资");
            fakuan = daysalary / 2;
        } else {
            System.out.println("扣除一日工资");
        }
            fakuan = daysalary;
        return fakuan;
    }

}

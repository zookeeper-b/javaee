public class Test22 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long result = factorial(11);
        long endTime = System.currentTimeMillis();
        System.out.println("递归时间" + (endTime - startTime));
        System.out.println(result);
    }


    //阶乘 5！
    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


}

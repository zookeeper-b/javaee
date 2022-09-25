package bhq;

public class TestDG {
    public static void main(String[] args) {
        long s1 = System.currentTimeMillis();
        System.out.printf("阶乘的结果为%s%n" , dg(5));
        long s2 = System.currentTimeMillis();
        System.out.println("递归耗时为："+(s2-s1));
    }

    static long dg(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * dg(i - 1);
        }

    }
}

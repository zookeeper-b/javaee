public class TestNum100 {
    public static void main(String[] args) {
        int oddSum = 0, evenSum = 0;//奇数和，偶数和
        int sum = 0;//总和sum
        for (int i = 0; i <= 100; i++) {
            sum += i;
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("100之内的数值累加和" + sum);
        System.out.println("100之内的数值奇数和" + oddSum);
        System.out.println("100之内的数值偶数和" + evenSum);
    }
}

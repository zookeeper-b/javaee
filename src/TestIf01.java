/**
 *
 */
public class TestIf01 {

    public static void main(String[] args) {
        double i = (int) (Math.random() * 6 + 1);
        double j = (int) (Math.random() * 6 + 1);
        double k = (int) (Math.random() * 6 + 1);

        int count = (int) (i + j + k);
        if (count > 15) {
            System.out.println("今天手气不错，再来一把");
        } else if (count >= 10 && count <= 15) {
            System.out.println("手气一般般");
        } else if (count < 10) {
            System.out.println("手气真TMD差劲");

        }
        System.out.println("宝贝，你的得分是：" + count);
    }

}

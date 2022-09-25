public class TestIf03 {
    public static void main(String[] args) {
        int age = (int) (120 * Math.random());
        System.out.println("年龄" + age);
        if (age < 15) {
            System.out.println("小屁孩" + age);
        } else if (age > 15 && age < 45) {
            System.out.println("青少年加油" + age);
        } else if (age > 45 && age < 75) {
            System.out.println("你还没有老，还能干" + age);
        } else {
            System.out.println("你是真的老了" + age);
        }
    }
}

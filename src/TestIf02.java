public class TestIf02 {
    public static void main(String[] args) {
        double r = 4 * Math.random();
        double area = Math.PI * r * r;
        double circle = 2 * Math.PI * r;
        System.out.println("半径" + r);
        System.out.println("面积" + area);
        System.out.println("周长" + circle);

        if (area > +circle) {
            System.out.println("面积的数值大于周长");
        } else {
            System.out.println("面积的数值小于周长");
        }
        int a = 3, b = 4;
        int c = a > b ? b : a;
        System.out.println(c);
    }

}

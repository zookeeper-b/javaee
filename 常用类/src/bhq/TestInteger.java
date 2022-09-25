package bhq;

//测试包装类的都使用
public class TestInteger {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer j = Integer.valueOf(50);

        int a = j.intValue();
        double b = j.doubleValue();

        Integer m = Integer.valueOf("456");
//        Integer n=Integer.valueOf("456ads");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //测试自动装箱
        //自动装箱时对于[-128~127]之间是有缓存的
        Integer x = 100;    //Integer x=Integer.valueOf(100);
        int y = x;         //int y=x.intValue();

       //测试缓存问题
        Integer x1=127;
        Integer x2=127;
        Integer x3=1000;
        Integer x4=1000;

        System.out.println(x1==x2);
        System.out.println(x3==x4);
        System.out.println(x1.equals(x2));
        System.out.println(x3.equals(x4));
    }
}

package bhq;

public class Test {
    public static void main(String[] args) {

        Integer i3 = Integer.valueOf("232");
        Integer i4 = Integer.parseInt("123");
        System.out.println(i3);
        System.out.println(i4);

        String str = i3.toString();
        System.out.println(str);

        Integer a1 = 300;
        Integer a2 = null;


        int b = a1;
        System.out.println(b);


        Integer d1 = 4000;
        Integer d2 = 4000;


        //当数字代-128~127返回缓存数组中的某个元素
        Integer d3 = 123;
        Integer d4 = 123;

        System.out.println(d1 == d2); //d1和d2是两个不同的对象
        System.out.println(d3 == d4); //d1和d2是两个不同的对象
        System.out.println(d1.equals(d2));//比较的是内容是否相同

        System.out.println((int) (Math.random()*15));





    }


}

package bhq;

public class TestDifferOfBuilderAndBuffer {


    public static void main(String[] args) {
        String str8 = "";
        long num1 = Runtime.getRuntime().freeMemory();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            str8 = str8 + i;
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println(num1 - num2);
        System.out.println(time2 - time1);
        System.out.println("-----------------------");
        StringBuilder sb1 = new StringBuilder();
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            sb1.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println(num3 - num4);
        System.out.println(time4 - time3);
        System.out.println("-----------------");
        StringBuffer sb2 = new StringBuffer();
        long num5 = Runtime.getRuntime().freeMemory();
        long time5 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            sb2.append(i);
        }
        long num6 = Runtime.getRuntime().freeMemory();
        long time6 = System.currentTimeMillis();
        System.out.println(num5 - num6);
        System.out.println(time6 - time5);


    }


}

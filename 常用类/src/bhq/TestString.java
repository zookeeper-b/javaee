package bhq;

public class TestString {
    public static void main(String[] args) {
        String str = "abc";
        StringBuilder sb = null;
        StringBuffer sb2 = null;

        sb = new StringBuilder("bai");
        sb.append("123");
        sb.append("456");
        System.out.println(sb);
        sb.append("aa").append("bb").append("cc");
        System.out.println(sb);
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
        System.out.println(sb);


    }
}

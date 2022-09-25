public class TestContine {
    public static void main(String[] args) {
        int count = 0;
//        for (int i = 100; i <= 151; i++) {
//            if (i % 3 == 0) {
//                continue;
//            }
//
//            System.out.print(i + "\t");
//            count++;
//            if(count==5){
//                System.out.println();
//                count=0;
//            }
//
//        }
        outer:
        for (int i = 101; i < 150; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.print(i + "\t");
        }
    }
}

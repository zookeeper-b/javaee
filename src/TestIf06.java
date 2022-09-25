public class TestIf06 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(j + "\t");
//            }
//            System.out.println();
//        }


//        for (int m = 1; m <= 9; m++) {
//            for (int n = 1; n <= m; n++) {
//                System.out.print(n + "*" + m + "=" + "=" + (n * m + "\t"));
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 4; j++) {
                if((i+j)%2==1){
                    System.out.print("*\t");

                }

                else{
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }


    }
}

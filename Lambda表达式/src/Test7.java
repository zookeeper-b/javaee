public class Test7 {
    public static void main(String[] args) {
        int num = 10;
//        NoReturnNoParam noReturnNoParam=new NoReturnNoParam() {
//            @Override
//            public void method() {
//                System.out.println("bhq");
//                System.out.println(num);
//            }
//        };
//
//        noReturnNoParam.method();
        NoReturnNoParam noReturnNoParam = () -> {
            System.out.println(num);
        };
        noReturnNoParam.method();

    }
}

import static java.lang.Math.pow;

public class Test2 {
    public static void main(String[] args) {
//        ReturnOneParam returnOneParam = a -> (int) doubleNum(a);
        ReturnOneParam returnOneParam=Test::doubleNum;

        returnOneParam.method(10);

        System.out.println(returnOneParam.method(20));



        Test test=new Test();
        ReturnOneParam returnOneParam1=test::addTwo;
        int value=returnOneParam1.method(10);
        System.out.println(value);

    }


}

import static java.lang.Math.pow;

public class Test {
    public static void main(String[] args) {
        NoReturnNoParam noReturnNoParam = () -> System.out.println("NoReturnNoParam");

        noReturnNoParam.method();

        NoReturnOneParam noReturnOneParam = a -> {
            System.out.println("NoReturnOneParam" + a);
        };
        noReturnOneParam.method(10);

        NoReturnMultiParam noReturnMultiParam = (a, b) -> {
            System.out.println("NoReturnMultiParam" + a + "\t" + b);
        };
        noReturnMultiParam.method(10, 20);

        ReturnNoParam returnNoParam = () -> {
            System.out.println("ReturnNoParam");
            return 10;
        };
        returnNoParam.method();
        System.out.println(returnNoParam.method());

        ReturnOneParam returnOneParam = a -> {
            System.out.print("ReturnOneParam     ");
            return a;
        };
        System.out.println(returnOneParam.method(10));

        ReturnParam returnParam=( a, b)->{
            System.out.println("ReturnParam"+a+"\t"+b);
            return a+b;
        };
        System.out.println(returnParam.method(10,20));




    }

    public static int doubleNum(int a) {
//        return pow(a,2);
       return 2 * a;
    }

    public int addTwo(int a) {
//        return pow(a,2);
        return 2 + a;
    }
}

@FunctionalInterface
interface NoReturnNoParam {
    void method();
}

@FunctionalInterface
interface NoReturnOneParam {
    void method(int a);
}

@FunctionalInterface
interface NoReturnMultiParam {
    void method(int a, int b);
}

@FunctionalInterface
interface ReturnNoParam {
    int method();
}

@FunctionalInterface
interface ReturnOneParam {
    int method(int a);
}

@FunctionalInterface
interface ReturnParam {
    int method(int a, int b);
}


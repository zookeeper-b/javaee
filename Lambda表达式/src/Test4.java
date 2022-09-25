import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//class ConsumerImpl implements Consumer {
//
//    @Override
//    public void accept(Object o) {
//        System.out.println(o);
//    }
//}

public class Test4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
//        ConsumerImpl c = new ConsumerImpl();
//        list.forEach(c);
        System.out.println("-------------");
        list.forEach(System.out::println);



    }
}

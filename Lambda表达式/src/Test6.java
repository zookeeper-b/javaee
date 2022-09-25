import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("c");
        list.sort((o1, o2) -> o1.compareTo(o2));
        list.forEach(System.out::println);
    }
}
//class ComparatorImpl implements Comparator<String>{
//    @Override
//    public int compare(String o1, String o2) {
//        return o1.compareTo(o2);
//    }
//}
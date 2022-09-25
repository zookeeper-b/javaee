import java.lang.reflect.Field;

public class GetField {
    public static void main(String[] args) throws NoSuchFieldException {
        Class clazz = User.class;
        Field[] fields = clazz.getFields();
        for (Field f : fields
        ) {
            System.out.println(f);
            System.out.println(f.getName());
        }
        System.out.println("__________________");
        Field[] fields2 = clazz.getDeclaredFields();
        for (Field f : fields2
        ) {
            System.out.println(f);
            System.out.println(f.getName());
        }
        System.out.println("____________");
        Field fields3 = clazz.getField("userage");
        System.out.println(fields3);
        System.out.println("____________");
        Field fields4 = clazz.getDeclaredField("username");
        System.out.println(fields4);


    }
}

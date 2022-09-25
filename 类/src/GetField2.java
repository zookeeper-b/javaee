import java.lang.reflect.Field;

public class GetField2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class clazz=User.class;
        Field field=clazz.getField("userage");
        Object obj=clazz.newInstance();
        field.set(obj,20);
        System.out.println(field);
        Object o=field.get(obj);
        System.out.println(o);
        System.out.println(field.get(obj));

    }
}

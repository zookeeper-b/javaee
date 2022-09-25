import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Class.forName("User");
        User user = (User) clazz.newInstance();
        long l1 = System.currentTimeMillis();
        Method method = clazz.getMethod("setUsername", String.class);
        method.setAccessible(true);
        for (int i = 0; i < 10000000; i++) {
            method.invoke(user, "bhq");

        }
        long l2 = System.currentTimeMillis();
        System.out.println("反射耗时");
        System.out.println(l2 - l1);


        System.out.println("----------");
        long l3 = System.currentTimeMillis();
        User user1 = new User();
        for (int i = 0; i < 10000000; i++) {
            user1.setUsername("lxy");

        }
        long l4 = System.currentTimeMillis();
        System.out.println("普通方法耗时");
        System.out.println(l4 - l3);
    }


}

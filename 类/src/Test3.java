import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        User user = new User();
        Class clazz = user.getClass();
        Field field = clazz.getDeclaredField("username");
        //setAccessible()方法是忽略java反射中的安全检查，其默认值是false
        field.setAccessible(true);
        field.set(user, "bhq");
        Object object = field.get(user);
        System.out.println(object);

        System.out.println("--------------");
        Method method=clazz.getDeclaredMethod("sb");
        method.setAccessible(true);
        method.invoke(user);




    }


}

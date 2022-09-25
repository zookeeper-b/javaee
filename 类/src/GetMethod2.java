import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetMethod2 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class clazz = User.class;
        Method method = clazz.getMethod("setUsername", String.class);
        Object obj=clazz.newInstance();
        method.invoke(obj,"bhq");
        Method method1=clazz.getMethod("getUsername");

        Object value=method1.invoke(obj);
        System.out.println(value);
        System.out.println(method1.getName());
        System.out.println(method1.invoke(obj));
    }
}

import java.lang.reflect.Method;

public class GetMethod {
    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz = User.class;
        Method[] methods = clazz.getMethods();
        for (Method m : methods
        ) {
            System.out.println(m);
            System.out.println(m.getName());
        }
        System.out.println("-----");
        Method[] methods2 = clazz.getDeclaredMethods();
        for (Method m : methods2
        ) {
            System.out.println(m);
            System.out.println(m.getName());
        }
        System.out.println("---------");
        Method method = clazz.getMethod("setUserage", int.class);
        System.out.println(method.getName());
        System.out.println(method);
        System.out.println("---------");
        Method method1 = clazz.getDeclaredMethod("sb");
        System.out.println(method1);
        System.out.println(method1.getName());
    }


}

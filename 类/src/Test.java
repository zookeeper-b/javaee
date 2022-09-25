import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ReflectDemo rd = new ReflectDemo();
        if (args != null && args.length > 0) {
            Class clazz = rd.getClass();

            Method[] method = clazz.getMethods();

            for (String str : args
            ) {
                for (int i = 0; i < method.length; i++) {
                    if (str.equalsIgnoreCase(method[i].getName())) {
                        method[i].invoke(rd);
                        break;

                    }
                }
            }

        } else {
            rd.method1();
            rd.method2();
            rd.method3();
        }


    }


}

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetConstructor2 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = User.class;
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Object o = constructor.newInstance("bhq", 18);
        User user=(User) o;
        System.out.println(user.getUsername()+"\t"+user.getUserage());
        System.out.println(o);


    }
}

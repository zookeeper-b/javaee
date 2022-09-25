public class GetClassInfo {
    public static void main(String[] args) {
        Class clazz=User.class;
        String className=clazz.getName();
        System.out.println(className);
        System.out.println(clazz.getName());


        System.out.println(clazz.getPackage());
        System.out.println(clazz.getSuperclass());
        Class[]arr=clazz.getInterfaces();
        for (Class c:arr
             ) {
            System.out.println(c.getName());
        }

    }
}

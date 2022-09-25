public class GetClass1 {
    public static void main(String[] args) {
        User user = new User();
        Class c = user.getClass();
        System.out.println(user.getClass());
        System.out.println(c);
        System.out.println(c.getName());

    }

}

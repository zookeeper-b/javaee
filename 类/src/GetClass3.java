public class GetClass3 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("User");
            System.out.println(clazz);
            System.out.println(clazz.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

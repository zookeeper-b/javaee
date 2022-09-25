import java.io.Serializable;

public class User implements Serializable {
    private String username;
    public int userage;

    public User(String username, int userage) {
        this.username = username;
        this.userage = userage;
    }

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    private User(int userage) {
        this.userage = userage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    private void sb(){
        System.out.println("sb");
    }
}

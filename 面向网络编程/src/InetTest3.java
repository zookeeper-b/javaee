import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest3 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress=InetAddress.getByName("180.97.34.94");
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());
    }
}

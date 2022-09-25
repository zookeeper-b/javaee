import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {


    public static void main(String[] args) throws UnknownHostException {


        InetAddress inetAddress = InetAddress.getLocalHost();

        System.out.println(inetAddress.getHostAddress());

        System.out.println(inetAddress.getHostName());




    }
}

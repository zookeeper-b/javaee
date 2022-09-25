import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class UDPClient {
    public static void main(String[] args) {

        DatagramSocket ds =null;
        try {

            byte[] b = "白汉淇".getBytes(StandardCharsets.UTF_8);
            DatagramPacket dp = new DatagramPacket(b, b.length, new InetSocketAddress("127.0.01", 9999));
            ds=new DatagramSocket(8888);

            try {
                ds.send(dp);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } finally {
            if (ds!=null){
                ds.close();
            }
        }
    }

}

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class BasicTypeServer {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        DataInputStream ds = null;

        try {
            datagramSocket = new DatagramSocket(new InetSocketAddress(9999));
            byte[] buf = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
            datagramSocket.receive(datagramPacket);
            ds = new DataInputStream(new ByteArrayInputStream(datagramPacket.getData()));
            System.out.println(ds.readLong());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (datagramSocket != null) {
                datagramSocket.close();
            }
            if (ds != null) {
                try {
                    ds.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}

import java.io.*;
import java.net.Socket;

public class BasicSocketCilent {
    public static void main(String[] args) {
        Socket socket = null;
        PrintWriter pw = null;
        try {
            socket = new Socket("127.0.0.1", 888);
            pw = new PrintWriter(socket.getOutputStream());
            pw.println("废物服务器");
            pw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}

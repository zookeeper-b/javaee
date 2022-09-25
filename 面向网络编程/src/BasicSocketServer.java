import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//服务器端
public class BasicSocketServer {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        BufferedReader br = null;
        try {
            ServerSocket serverSocket = new ServerSocket(888);
            System.out.println("服务器启动监听等待连接");
            socket = serverSocket.accept();//开启端口的监听
            //读取客户端发送的消息
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
            if (socket != null) {
                socket.close();
            }
        }


    }
}



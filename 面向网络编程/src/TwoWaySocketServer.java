import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TwoWaySocketServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        Scanner scanner = null;
        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("服务器启动，监听8888");
            socket = serverSocket.accept();
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            scanner = new Scanner(System.in);
            printWriter = new PrintWriter(socket.getOutputStream());
            while (true) {
                String str = bufferedReader.readLine();
                System.out.println("客户端说" + str);
                String keyInput = scanner.nextLine();
                printWriter.println(keyInput);
                printWriter.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (scanner != null) {
                        scanner.close();
                    }
                }
            }


        }


    }
}

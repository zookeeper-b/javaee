import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TwoWaySocketClient {
    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = null;
        PrintWriter printWriter = null;
        BufferedReader bufferedReader = null;

        try {
            socket = new Socket("127.0.0.1", 8888);
            scanner = new Scanner(System.in);
            printWriter = new PrintWriter(socket.getOutputStream());
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String keyInput = scanner.nextLine();
                printWriter.println(keyInput);
                printWriter.flush();
                String input = bufferedReader.readLine();
                System.out.println("服务器说" + input);


            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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

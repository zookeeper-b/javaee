import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class OneWaySocketClient {
    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = null;
        PrintWriter pw = null;
        BufferedReader br = null;

        try {
            socket = new Socket("127.0.0.1", 520);
            scanner = new Scanner(System.in);
            pw = new PrintWriter(socket.getOutputStream());
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String str = scanner.nextLine();
                pw.println(str);
                pw.flush();
                if ("exit".equals(str)) {
                    break;
                }

                String serverInput = br.readLine();
                System.out.println("服务端返回的" + serverInput);


            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(scanner!=null){
                scanner.close();
            }
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (pw!=null){
                pw.close();
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }


}

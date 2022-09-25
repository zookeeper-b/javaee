import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatSocketClient {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("127.0.0.1",8888);
            System.out.println("连接成功");
            new ClientSend(socket).start();
            new ClientReceive(socket).start();

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
class ClientSend extends Thread {
    private Socket socket;

    public ClientSend(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        this.sendMsg();
    }

    private void sendMsg() {
        Scanner scanner = null;
        PrintWriter pw = null;
        try {
            scanner = new Scanner(System.in);
            pw = new PrintWriter(this.socket.getOutputStream());
            while (true) {
                String msg = scanner.nextLine();
                pw.println(msg);
                pw.flush();

            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (pw != null) {
                pw.close();
            }
            if (this.socket != null) {
                try {
                    this.socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }


}

class ClientReceive extends Thread {
    private Socket socket;

    public ClientReceive(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        this.receiveMsg();
    }

    public void receiveMsg() {
        BufferedReader br = null;


        try {
            br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            while (true) {
                String msg = br.readLine();
                System.out.println("他说"+msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
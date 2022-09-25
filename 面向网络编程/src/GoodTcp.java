import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class GoodTcp {
    public static void main(String[] args) {
        Scanner scanner = null;
        ServerSocket serverSocket = null;
        Socket socket = null;


        try {
            scanner = new Scanner(System.in);
            System.out.println("请输入：server,<port>或者：<ip>,<port>");
            String str = scanner.nextLine();
            String[] arr = str.split(",");
            if ("server".equals(arr[0])) {
                System.out.println("TCP Server Listen at" + arr[1]);
                serverSocket = new ServerSocket(Integer.parseInt(arr[1]));
                socket = serverSocket.accept();
                System.out.println("连接成功!");

            } else {
                socket = new Socket(arr[0], Integer.parseInt(arr[1]));
                System.out.println("连接成功");

            }

            new Send1(socket, scanner).start();

            new Receive1(socket).start();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class Send1 extends Thread {
    private Socket socket;
    private Scanner scanner;

    public Send1(Socket socket, Scanner scanner) {
        this.socket = socket;
        this.scanner = scanner;
    }


    @Override
    public void run() {
        this.sendMsg();
    }

    private void sendMsg() {

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

class Receive1 extends Thread {
    private Socket socket;

    public Receive1(Socket socket) {
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
                System.out.println("他说" + msg);
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

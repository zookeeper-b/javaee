import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatRoomServer {
    public static String buf;

    public static void main(String[] args) {
        System.out.println("Chat Server Version 1.0");
        System.out.println("Listion at 8888");
        ServerSocket serverSocket = null;
        try {
            serverSocket=new ServerSocket(8888);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("连接到" + socket.getInetAddress());
                new ChatReceive(socket).start();
                new ChatSend(socket).start();
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
            }
        }


    }
}

class ChatReceive extends Thread {
    private Socket socket;

    public ChatReceive(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        this.receiveMsg();
    }

    private void receiveMsg() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            while (true) {
                String msg = br.readLine();
                synchronized ("abc") {
                    ChatRoomServer.buf = "[" + this.socket.getInetAddress() + "]" + msg;
                    "abc".notifyAll();

                }


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

class ChatSend extends Thread {
    private Socket socket;

    public ChatSend(Socket socket) {
        this.socket = socket;
    }

    private void sendMsg() {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new OutputStreamWriter(this.socket.getOutputStream()));
            while (true) {
                synchronized ("abc") {

                    "abc".wait();
                    pw.println(ChatRoomServer.buf);
                    pw.flush();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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


    @Override
    public void run() {
        this.sendMsg();
    }


}
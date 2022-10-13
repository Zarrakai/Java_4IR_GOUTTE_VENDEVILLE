import java.net.ServerSocket;

import java.net.ServerSocket ;
import java.net.Socket ;
import java.io.*;

class SocketThreadServer {

    public static void main(String[] args) throws IOException{
        ServerSocket servSocket = new ServerSocket(1234);
        Socket link = servSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(link.getInputStream()));
        PrintWriter out = new PrintWriter(link.getOutputStream(),true);
        System.out.println("awaiting data...");
        String input = in.readLine();
        link.close();
    }

}
import java.net.ServerSocket;

import java.net.ServerSocket ;
import java.net.Socket ;
import java.io.*;

class ClientThreadServer {

    public static void main(String[] args) throws IOException{
        Socket link = new Socket("127.0.0.1", 1234);
        BufferedReader in = new BufferedReader(new InputStreamReader(link.getInputStream()));
        PrintWriter out = new PrintWriter(link.getOutputStream(),true);
        System.out.println("sending data...");
        out.println("ghsdjkl");
        link.close();
    }

}
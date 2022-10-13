import java.net.ServerSocket;

import java.net.ServerSocket ;
import java.net.Socket ;
import java.io.*;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

class SocketThreadClient {

    public static void main(String[] args) throws IOException{
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("date à envoyer : " + dtf.format(now));  
        
        
        Socket link = new Socket("127.0.0.1", 1234);
        BufferedReader in = new BufferedReader(new InputStreamReader(link.getInputStream()));
        PrintWriter out = new PrintWriter(link.getOutputStream(),true);
        



        
        System.out.println("sending following data : " + dtf.format(now));
        out.println(dtf.format(now));
        link.close();
    }

}
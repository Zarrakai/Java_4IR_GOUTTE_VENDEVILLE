import java.net.* ;
import java.io.*;

class SocketThreadClient {

    /* attention au port choisi : réservés jusqu'à 1024 pour des protocoles */
    public static void main(String[] args) throws IOException{

        Socket link = new Socket("127.0.0.1", 1234);
        PrintWriter out = new PrintWriter(link.getOutputStream(),true);       
        out.println("hjmkljhghfvbn,");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
        out.println("message 2");
    }

}
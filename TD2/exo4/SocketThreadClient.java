import java.net.* ;
import java.io.*;

class SocketThreadClient {

    /* attention au port choisi : réservés jusqu'à 1024 pour des protocoles */
    public static void main(String[] args) throws IOException{
        Socket link = null;
        int depart = 1025, portsAAfficher = 250;
        for (int i=depart; i<depart+portsAAfficher; i++){
            try {
                link = new Socket("127.0.0.1", i);
                System.out.println("server listening on port" + i);
                link.close();
            } catch (ConnectException e) {
                System.out.println("server not listening on port" + i);
            }
        }

    }

}
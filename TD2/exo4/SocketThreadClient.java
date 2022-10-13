import java.net.* ;
import java.io.*;

class SocketThreadClient {

    public static void main(String[] args) throws IOException{
        Socket link = null;
        for (int i=0; i<1024; i++){
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
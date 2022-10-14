import java.net.* ;
import java.io.* ;


class SocketThreadServer {

    public static void main(String[] args) throws IOException{

        // V1
        

        ServerSocket servSocket = new ServerSocket(1234);

        Socket link = null;
        for (int i = 0; i < 5; i++) {
            
            link = servSocket.accept();
            new ForkServer(link).start();
        }
        
        link.close();
        

        // Faire V2 avec un runnable ; alimenter file d'attente avec new(runnableThreadServer) en gros
    }

}
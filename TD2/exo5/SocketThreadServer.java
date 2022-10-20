import java.net.* ;
import java.io.* ;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class SocketThreadServer {

    public static void main(String[] args) throws IOException{

        // V1
        ServerSocket servSocket = new ServerSocket(1234);
 // Faire V2 avec un runnable ; alimenter file d'attente avec new(runnableThreadServer) en gros
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Socket link = null;
        for (int i = 0; i < 5; i++) {
            
            link = servSocket.accept();
            executorService.execute(new ForkServer(link));
        }
        
        link.close();
        

       executorService.shutdown();;
    
    
    }

}
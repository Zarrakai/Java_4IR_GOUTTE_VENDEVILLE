import java.net.* ;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.*;

class IpBox {

    /* attention au port choisi : réservés jusqu'à 1024 pour des protocoles */
    public static void main(String[] args) throws IOException{

        ServerSocket socket_TCP = new ServerSocket(1234);
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Socket link = null;
        
        link = socket_TCP.accept();
        executorService.execute(new ForkServer(link));
        
        
        link.close();
        

       executorService.shutdown();;
    }

}
import java.net.* ;
import java.io.*;


class SocketThreadServer {

    public static void main(String[] args) throws IOException{
        ServerSocket servSocket = new ServerSocket(450);
        Socket link = servSocket.accept();
        System.out.println("connected");
        link.close();

        ServerSocket servSocket2 = new ServerSocket(1000);
        Socket link2 = servSocket2.accept();
        System.out.println("connected");
        link2.close();

    }

}
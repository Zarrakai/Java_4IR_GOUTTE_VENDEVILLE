import java.net.* ;
import java.io.* ;


class TestBox {

    public static void main(String[] args) throws IOException{

        // config de TCP
        ServerSocket socket_TCP_rcv = new ServerSocket(1234);
        Socket link = socket_TCP_rcv.accept();
        BufferedReader in_TCP_rcv = new BufferedReader(new InputStreamReader(link.getInputStream()));
        

        ServerSocket socket_TCP_send = new ServerSocket(1234);
        link = socket_TCP_send.accept();
        PrintWriter out_TCP_send = new PrintWriter(link.getOutputStream(),true);
        
        
        // config de UDP
        DatagramSocket dgramSocket_App = new DatagramSocket(1234);
        byte[] buffer_app = new byte[256];
        DatagramPacket inPacket_app = new DatagramPacket(buffer_app, buffer_app.length);
        InetAddress clientAddress_app = inPacket_app.getAddress();
        int clientPort_app = inPacket_app.getPort();
        String message_app = new String(inPacket_app.getData(), 0, inPacket_app.getLength());

        DatagramSocket dgramSocket_lFace = new DatagramSocket(1234);
        byte[] buffer = new byte[256];
        DatagramPacket inPacket = new DatagramPacket(buffer, buffer.length);
        InetAddress clientAddress = inPacket.getAddress();
        int clientPort = inPacket.getPort();

        String response;
        String message = new String(inPacket.getData(), 0, inPacket.getLength());
        DatagramPacket outPacket = new DatagramPacket(response.getBytes(), response.length(),clientAddress, clientPort);
        
        
        dgramSocket_lFace.send(outPacket);
        dgramSocket_lFace.close();
        
        
        
        
        
        link.close();
    
    }

}
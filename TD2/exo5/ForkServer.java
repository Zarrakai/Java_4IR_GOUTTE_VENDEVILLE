import java.net.* ;
import java.io.* ;


class ForkServer extends Thread{
    private Socket link;

    ForkServer(Socket link) {
        super();
        this.link = link;
    }

    ForkServer() {
        super();
    }

    void setLink(Socket link)
    {
        this.link = link;
    }

    @Override
    public void run (){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(this.link.getInputStream()));
            System.out.println("awaiting message...");
            String input = in.readLine();
            System.out.println("message received : " + input);
        } catch (IOException e) {
            System.out.println("Erreur IOException");
        }
    }
    


}
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by iheb on 10/12/15.
 */
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.ServerSocket;


public class main {



    public static void main(String[] args) throws IOException {
        try {
            System.out.println("[+] Server side application");
            ServerSocket sc = new ServerSocket(1200);
            System.out.println("[+] Listenning...");
            Socket socket = sc.accept();
            System.out.println(" [+] Client Accepted ip: " + sc.getInetAddress()+" port: "+sc.getLocalPort());

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(socket.getOutputStream());
            String clientSentexnce = inFromClient.readLine();
            System.out.println("Received: " + clientSentexnce);
        sc.close();
        }
        catch (Exception e)
        {

        }
    }


}
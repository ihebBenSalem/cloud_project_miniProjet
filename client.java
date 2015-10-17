/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttcp;

/**
 *
 * @author iheb
 */
import java.net.Socket;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class ClientTCP {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("[+] client side");
        Socket sc=new Socket("127.0.0.1",1200);
        System.out.println("[+] trying to connect to server");
        System.out.println("[*] Write data:");

        Scanner i=new Scanner(System.in);
        String msg=i.nextLine();
        PrintStream out =new PrintStream(sc.getOutputStream());
        
        out.print(msg);
        out.flush();
        out.close();
        
    }
    
}

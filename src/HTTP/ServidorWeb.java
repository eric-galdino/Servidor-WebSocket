package HTTP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorWeb {


	public static void main (String [] args) throws IOException {
		
		ServerSocket servidor = new ServerSocket(7070);
	    System.out.println("Porta 7070 aberta!");  

	    while(true)
	    {
		    	Socket socket = servidor.accept();
				Thread threadRequest = new Thread(new RequestHttp(socket));
				threadRequest.start(); 
	    }
	    
	}
}
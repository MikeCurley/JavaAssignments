import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class Server1 {
	private Socket s;	

	public static void main(String[] args){
		try{
		ServerSocket server = new ServerSocket(9999);//create server socket
		Server1 serverInstance= new Server1();//create an instance of Server class
		System.out.println("Server running. Waiting for a client toconnect...");

		while(true) {//wait for client to connect
				serverInstance.s = server.accept();
				System.out.println("Client connected to here");
				System.out.println("Client disconnected. Waiting for a new client to connect...");
		}
		}catch(IOException e){
			
			
		}

	}
	public void run(){
		
	}

}

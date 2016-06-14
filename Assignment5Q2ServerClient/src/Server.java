//asignment5 Q2 Michael Curley ID 14231371 based on code supplied by Dr Matthias Nickles lecture notes
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Server extends Thread implements Runnable{

	private Socket s;//create socket
	private Scanner in;//scanner object in
	private PrintWriter out;//output stream
	ArrayList<String> aToken = new ArrayList<String>();//arraylist to hold tokens
	Scanner Sc = new Scanner(System.in);//creating a scanner object
	private Thread t;

	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket(9999);//create server socket
		Server serverInstance= new Server();//create an instance of Server class
		System.out.println("Server running. Waiting for a client toconnect...");

		while(true) {//wait for client to connect
				serverInstance.s = server.accept();
				System.out.println("Client connected to here");
				(new Thread(serverInstance)).start();//create a new thread for each new client
				System.out.println("Client disconnected. Waiting for a new client to connect...");
		}


	}


	@Override
	public void run() {//method to set up sockets and string passers
		try {
			try {
				synchronized(this){
					in = new Scanner(s.getInputStream());
					out = new PrintWriter(s.getOutputStream());
					System.out.println("thread No  "+Thread.activeCount()+"  thread reference "+Thread.currentThread().getName());
					//check();
					doService(); // the actual service
				}
			} finally {
				System.out.println("close");
				s.close();
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void doService() throws IOException {//method to take a string from the client and read the first string and then whitespace
		while(true) {
			if(!in.hasNext())
				return;
			String request = in.next();//VERY IMPORTANT CODE READS THE COMMAND AND THEN WHITESPACE
			System.out.println("Request received: " + request);//print out request
			handleTokenRequest(request);//pass the command to the method to do something with it
		}
	}
	public synchronized void handleTokenRequest(String request) {
		String sentance="";//VERY INPORTANT CODE reads the next string after the command or after whitespace
		sentance=in.next();
		synchronized(this){
			System.out.println("Command "+request+" and the sentance is  "+sentance);
			if(request.equals("SUBMIT")){//check if command is submit
				if(aToken.size()<10){//if the size is less than 10 add token
					if(aToken.contains(sentance)==false){//if the token is not on the list add it
						aToken.add(sentance);
						Collections.sort(aToken,Collections.reverseOrder());//sorts first in accending order and then in reverse order
						out.println(aToken+" >> OK");
					}else{
						out.println(sentance+" ERROR is already in the list");
					}

					out.flush(); 
				}else{
					out.println("ERROR LIST IS FULL");//if there is more than 10 tokens
				}
			}else if(request.equals("REMOVE")){
				aToken.remove(sentance);
				Collections.sort(aToken,Collections.reverseOrder());//sorts in reverse order
				out.println(aToken+" >> OK");
				out.flush(); 

			}else if(request.equals("QUIT")){
				out.close();

			}else
				System.err.println("Unknown request!");


			out.flush(); 
		}
	}

}

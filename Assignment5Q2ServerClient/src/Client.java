//asignment5 Q2 Michael Curley ID 14231371 based on code supplied by Dr Matthias Nickles lecture notes
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
public class Client implements Runnable{
	private String token="";//private data field for storage

	public Client(String token){//use constructor to initalise the value of token
		this.token=token;
	}

	@Override
	public void run(){
		try{
			newClient();//start new client
		}catch(IOException e){
			System.out.println("NOT WORKING CORRECTLY");
		}

	}
	public void newClient()throws IOException{//create a new client
		System.out.println("Client Name "+token);
		Scanner sC = new Scanner(System.in);//create the input output streams as required
		Socket s = new Socket("localhost", 9999);
		InputStream instream = s.getInputStream();
		OutputStream outstream = s.getOutputStream();
		Scanner in = new Scanner(instream);
		PrintWriter out = new PrintWriter(outstream);
		String request="";
		request="SUBMIT "+token+"\n";//load command and token into the request variable
		//request="REMOVE "+token+"\n";
		//request="QUIT \n";
		out.print(request);//send request
		out.flush();//output request
		String response = in.nextLine();//get responce from server
		System.out.println("Receiving Contents of the list in the Client: " + response);//print responce
		s.close();//close application

	}

	public static void main(String[] args) throws IOException {
		/* 4 instances of client are set up and interact with the server where each instance is assigned a thread
		 * to test the thread the tokens are hard coded in to see effect of threading  */
		Client c1 = new Client("mikee");
		c1.run();
		
		Client c2 = new Client("patrick");
		c2.run();
		
		Client c3 = new Client("johnny");
		c3.run();
		
		Client c4 = new Client("pat");
		c4.run();

	}


}

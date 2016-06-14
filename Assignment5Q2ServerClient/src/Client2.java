import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
public class Client2 implements Runnable{
	private String token="";
	
	public Client2(String token){
		this.token=token;
	}

	@Override
	public void run(){
		try{
			runClients();
		}catch(IOException e){
			System.out.println("NOT WORKING CORRECTLY");
		}

	}
	public void runClients() throws IOException{
		//String token="mike";
		Scanner sC = new Scanner(System.in);
		Socket s = new Socket("localhost", 9999);
		InputStream instream = s.getInputStream();
		OutputStream outstream = s.getOutputStream();
		Scanner in = new Scanner(instream);
		PrintWriter out = new PrintWriter(outstream);
		//String request="SUBMIT "+token+"\n";
		String request="";
		int option=0;
		int commandChoice=10;

		request="SUBMIT mike\n";
		//request="REMOVE mike\n";
		//request="QUIT\n";

		out.print(request);
		out.flush();
		String response = in.nextLine();
		System.out.println("Receiving Contents of the list in the Client: " + response);


		s.close();

	}
	public void newClient(String clientName)throws IOException{
		//String token="mike";
		System.out.println("Client Name "+clientName);
		Scanner sC = new Scanner(System.in);
		Socket s = new Socket("localhost", 9999);
		InputStream instream = s.getInputStream();
		OutputStream outstream = s.getOutputStream();
		Scanner in = new Scanner(instream);
		PrintWriter out = new PrintWriter(outstream);
		//String request="SUBMIT "+token+"\n";
		String request="";
		int option=0;
		int commandChoice=10;

		request="SUBMIT "+token+"\n";
		//request="REMOVE mike\n";
		//request="QUIT\n";

		out.print(request);
		out.flush();
		String response = in.nextLine();
		System.out.println("Receiving Contents of the list in the Client: " + response);


		s.close();
		
		
		
		
	}

	public static void main(String[] args) throws IOException {
		Client c1 = new Client("mikee");
		//c1.newClient("client 5");
		
		Client c2 = new Client("patrick");
		//c2.newClient("client 6");
		
		Client c3 = new Client("johnny");
		//c3.newClient("client 7");
		
		Client c4 = new Client("mary");
		//c4.newClient("client 8");
		
		
		
		
		/*String token="mike";
		Scanner sC = new Scanner(System.in);
		Socket s = new Socket("localhost", 9999);
		InputStream instream = s.getInputStream();
		OutputStream outstream = s.getOutputStream();
		Scanner in = new Scanner(instream);
		PrintWriter out = new PrintWriter(outstream);
		//String request="SUBMIT "+token+"\n";
		String request="";
		int option=0;
		int commandChoice=10;

		request="SUBMIT mike\n";
		//request="REMOVE mike\n";
		//request="QUIT\n";

		out.print(request);
		out.flush();
		String response = in.nextLine();
		System.out.println("Receiving Contents of the list in the Client: " + response);


		s.close();*/
	}


}
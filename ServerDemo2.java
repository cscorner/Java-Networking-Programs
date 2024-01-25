import java.io.*;
import java.net.*;
import java.util.Scanner;
class ServerDemo2
{
	public static void main(String a[]) throws IOException
	{
		try
		{
			
			
			Socket s;
			ServerSocket ss=new ServerSocket(3456);
			s=ss.accept();
			System.out.println("Connection Established!!");

			Scanner sc=new Scanner(s.getInputStream());
			PrintStream ps=new PrintStream(s.getOutputStream());

			ps.println("Hey!!! I'm Server");
			ps.flush();

			String msg=sc.nextLine();
			System.out.println("Received from Client:"+msg);

			s.close();
		
		
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
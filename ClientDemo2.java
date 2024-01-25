import java.io.*;
import java.net.*;
import java.util.Scanner;
class ClientDemo2
{
	public static void main(String a[]) 
	{
		try
		{
			Socket s=new Socket("127.0.0.1",3456);
			Scanner sc=new Scanner(s.getInputStream());
			PrintStream ps=new PrintStream(s.getOutputStream());

			String msg=sc.nextLine();
			System.out.println("Received from Server:"+msg);
	
			ps.println("Hiii!!! I'm Client");
			ps.flush();
			s.close();
		
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
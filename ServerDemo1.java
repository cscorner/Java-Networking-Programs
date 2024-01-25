import java.io.*;
import java.net.*;
import java.util.Scanner;
class ServerDemo1
{
	public static void main(String a[]) throws IOException
	{
		
		Socket s;
		ServerSocket ss=new ServerSocket(5678);
		while(true)	
		{
			s=ss.accept();
			System.out.println("Connection Established!!");
			Scanner sc=new Scanner(s.getInputStream());
			String msg=sc.nextLine();
			System.out.println("Received from Client:"+msg);
			s.close();
		}
		
	}
}
			
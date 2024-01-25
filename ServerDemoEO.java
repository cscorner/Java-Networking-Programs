import java.io.*;
import java.net.*;
import java.util.Scanner;
class ServerDemoEO
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
			int n=Integer.parseInt(msg);

			PrintStream ps=new PrintStream(s.getOutputStream());
			String st;
			if(n<0) 
			{
				st=n+" is -ve";
				ps.println(st);
			}
			else if(n>0) 
			{
				st=n+" is +ve";
				ps.println(st);
			}
			else
				ps.println("Zero");
		
		
			s.close();

		}
		
	}
}
			
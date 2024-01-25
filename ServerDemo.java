import java.io.*;
import java.net.*;
class ServerDemo
{
	public static void main(String a[]) throws IOException
	{
		PrintStream ps;
		Socket s;
		ServerSocket ss=new ServerSocket(4567);//port
		while(true)	
		{
			s=ss.accept();//blocking
			System.out.println("Connection Established!!");
			ps=new PrintStream(s.getOutputStream());
			ps.println("Hey!!! I'm Server");
			ps.flush();
			s.close();
		}
		
	}
}
			
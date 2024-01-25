import java.io.*;
import java.net.*;
class ClientDemo1
{
	public static void main(String a[]) throws Exception
	{
		Socket s=new Socket("127.0.0.1",5678);
		PrintStream ps=new PrintStream(s.getOutputStream());
		ps.println("Hiii!!! I'm Client");
		ps.flush();
		s.close();
		
	}
}
			
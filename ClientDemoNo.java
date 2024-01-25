import java.io.*;
import java.net.*;
class ClientDemoNo
{
	public static void main(String a[]) throws IOException
	{
		Socket s=new Socket("127.0.0.1",5678);
		System.out.println("Enter any no:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String no=br.readLine();
		PrintStream ps=new PrintStream(s.getOutputStream());
		ps.println(no);

		BufferedReader	br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msg=br1.readLine();
System.out.println(msg);
		ps.flush();
		s.close();
		
	}
}
			
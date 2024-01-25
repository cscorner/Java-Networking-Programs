import java.io.*;
import java.net.*;
class ServerDemoNo
{
	public static void main(String a[]) throws IOException
	{
		BufferedReader br;
		Socket s;
		ServerSocket ss=new ServerSocket(5678);
		while(true)	
		{
			s=ss.accept();
			System.out.println("Connection Established!!");
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msg=br.readLine();
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
			
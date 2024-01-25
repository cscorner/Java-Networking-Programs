import java.io.*;
import java.net.*;
class ClientDemos
{
	public static void main(String a[]) throws IOException
	{
		Socket s=new Socket("localhost",4567);
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String msg=br.readLine();
		System.out.println("Server:-"+msg);
		s.close();
		
	}
}
			
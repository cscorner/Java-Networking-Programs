import java.io.*;
import java.util.Scanner;
import java.net.*;
class ClientDemo
{
	public static void main(String a[]) throws IOException
	{
		Socket s=new Socket("localhost",4567);		
		Scanner sc=new Scanner(s.getInputStream());
		String msg=sc.nextLine();
		System.out.println("Server:-"+msg);
		s.close();
		
	}
}
			
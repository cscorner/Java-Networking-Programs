import java.io.*;
import java.net.*;
import java.util.Scanner;
class ClientDemoEO
{
	public static void main(String a[]) throws IOException
	{
		Socket s=new Socket("localhost",5678);
		System.out.println("Enter any no:");
		Scanner sc=new Scanner(System.in);
		String no=sc.nextLine();
		PrintStream ps=new PrintStream(s.getOutputStream());
		ps.println(no);

		Scanner sc1=new Scanner(s.getInputStream());
		String msg=sc1.nextLine();
		System.out.println(msg);
		ps.flush();
		s.close();
	}
}
			
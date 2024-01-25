import java.net.*;
public class UDPServer
{
 
	DatagramSocket ds;
	byte[] buf = new byte[256];
 	public static void main(String args[])throws Exception
	{
		new UDPServer();
	}
	public UDPServer()throws Exception
	{
        	
       		ds= new DatagramSocket(4444);
    		System.out.println("Server Ready...");
        	while (true) 
		{
            			DatagramPacket dp= new DatagramPacket(buf, buf.length);
            			ds.receive(dp);
            			String received = new String(dp.getData(), 0, dp.getLength());
        		 	System.out.println(received);

            			/*InetAddress addr = dp.getAddress();
            			int port = dp.getPort();
            			
            			DatagramPacket dp1 = new DatagramPacket(buf, buf.length, addr, port);

            			String msg="Hi from Server";
            			ds.send(dp1);
            			if (msg.equals("exit")) 			
					break;*/
				
       
            			
				
       		}
        		
    	}
}
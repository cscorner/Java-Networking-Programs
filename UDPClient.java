import java.net.*;
public class UDPClient 
{
 	DatagramSocket ds;
    	InetAddress addr;
 
   	byte[] buf;
 
    	public static void main(String args[])throws Exception
	{
		new UDPClient();
	}
	public UDPClient()throws Exception
	{
        	ds = new DatagramSocket();
        	addr = InetAddress.getByName("localhost");
    		String msg="CS Corner";
       	 	buf = msg.getBytes();
        	DatagramPacket dp=new DatagramPacket(buf, buf.length, addr, 4444);
        	ds.send(dp);

        		
            	/*DatagramPacket dp1 = new DatagramPacket(buf, buf.length);
       		ds.receive(dp1);
        	String received = new String(dp1.getData(), 0, dp1.getLength());
        	System.out.println(received);*/
        	ds.close();
    	}
}
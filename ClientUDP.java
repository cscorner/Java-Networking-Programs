import java.io.IOException;
import java.net.*;

public class ClientUDP {
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException {
        InetAddress ia=InetAddress.getByName("localhost");
        DatagramSocket ds=new DatagramSocket();
        //send
        String msg="Hello I'm client...";
        byte b[]=msg.getBytes()  ;                
        DatagramPacket dp=new DatagramPacket(b, b.length, ia, 5555);
        ds.send(dp);
       //receive
        byte data[]=new byte[1000];
        DatagramPacket dp1=new DatagramPacket(data, data.length);
        ds.receive(dp1);
        String str=new String(dp1.getData(),0,dp1.getLength());
        System.out.println(str);
        
        ds.close();
    }
}

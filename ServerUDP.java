import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServerUDP {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket ds=new DatagramSocket(6666);
        System.out.println("Server Started & Ready...");
        //receive
        byte b[]=new byte[1000];
        DatagramPacket dp=new DatagramPacket(b, b.length);
        ds.receive(dp);
        String str=new String(dp.getData(),0,dp.getLength());
        System.out.println(str);
        //send
        String msg="Hello I'm Server...";
        byte data[]=msg.getBytes()  ;  
        InetAddress ia = InetAddress.getLocalHost();        
        DatagramPacket dp1=new DatagramPacket(data, data.length, ia, dp.getPort());
        ds.send(dp1);
        ds.close();
    }
}

package ex04.net.udp;

import java.io.*;
import java.net.*;

public class UdpServer {
	private final  static int PACKETSIZE = 100;
	
	
	public static void main(String[] args) {
		if( args.length != 1) {
			System.out.println("using : DatagramServer port number : ");
			return; //제어권을 넘김
		}
		
		try {
			int port = Integer.parseInt(args[0]);
			DatagramSocket ds = new DatagramSocket(port);
			System.out.println("The Server is ready..");
			
			for(;;) {
				DatagramPacket dp = new DatagramPacket(new byte[PACKETSIZE], PACKETSIZE);
				ds.receive(dp);
				System.out.println(dp.getAddress() + " " + dp.getPort() + " : " + new String(dp.getData()));
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}

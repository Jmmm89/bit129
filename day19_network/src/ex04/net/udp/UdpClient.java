package ex04.net.udp;

import java.io.*;
import java.net.*;

public class UdpClient {
	private final  static int PACKETSIZE = 100;
	
	public static void main(String[] args) {
		
		
		
		if( args.length != 2) {
			System.out.println("using : DatagramServer host, port number : ");
			return; //������� �ѱ�
		}//if end
		
		DatagramSocket ds = null;
		try {
			InetAddress host = InetAddress.getByName(args[0]);
			int port = Integer.parseInt(args[1]);//���� ��Ʈ �ѹ�
			
			ds = new DatagramSocket();
			byte[] data = "Hello Server BitCamp 129 UDP test".getBytes();
			DatagramPacket dp = new DatagramPacket(data, data.length, host, port);
			
			ds.send(dp);
			
			ds.setSoTimeout(2000);
			dp.setData(new byte[PACKETSIZE]);
			System.out.println(new String(dp.getData()));
					
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(ds != null )ds.close();
		}
		
		
		
		
		
	}
}

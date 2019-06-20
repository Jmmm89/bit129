package ex03.net.udp;

import java.io.*;
import java.net.*;

public class DatagramServer {

	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataOutputStream dos = null;
		
		int port = 5000;
		String str;
		File file = null;
		
		try {
			System.out.println(" UDP File Server open ");
			ds = new DatagramSocket(port);
			
			while(true) {
				dp = new DatagramPacket(new byte[65656], 65656); //패킷그릇
				ds.receive(dp); //수신
				
				str = new String (dp.getData(), 0 , dp.getLength()).trim();
				
				if(str.equalsIgnoreCase("Start")) {
					System.out.println("전송중...");
					file = new File("test.txt");
					
					dos = new DataOutputStream(new BufferedOutputStream
							(new FileOutputStream(file)));
				} else if (str.equalsIgnoreCase("end")) {
					System.out.println("end");
					break;
				}else if( file != null ){
					System.out.println(str);
					dos.write(dp.getData(),0,dp.getLength());
				}//end if
				
			}//while end
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
}

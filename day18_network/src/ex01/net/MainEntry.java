package ex01.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.zip.InflaterInputStream;

public class MainEntry {
public static void main(String[] args) {
	
	
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	 String host = "10.10.10.168";
	 String strUrl = null;
	 InetAddress[] address;
	 System.out.println("site address = ");
	 
	 try {
		
			strUrl = br.readLine();
		
		
		address =InetAddress.getAllByName(strUrl);
		
		for (int i = 0; i < address.length; i++) {
			System.out.println(address[i]);
		}
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
}
}

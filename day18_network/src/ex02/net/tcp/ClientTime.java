package ex02.net.tcp;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

// Client - socket 1개
public class ClientTime {

	 public static void main(String[] args) {
		
		 String serverIP = "10.10.10.167"; //127.0.0.1 = 자기자신
		 int port = 7000;
		 Date date = null;
		 
		 try {
			Socket client = new Socket(serverIP, port);
			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			System.out.println("Server측 날짜/시간 확인 ... 이 라인은 클라이언트");
			
			date = (Date) ois.readObject();
			System.out.println("현재 시간  : "+ date + " 입니다.");
			
			String hi = (String) ois.readObject();
			System.out.println( hi + " 입니다.");
			ois.close();
			client.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		 
		 
	}
}

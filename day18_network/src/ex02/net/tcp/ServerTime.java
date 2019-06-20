package ex02.net.tcp;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

// Server - socket 2개 
public class ServerTime {
	public static void main(String[] args) {
		int port = 7001; // 0~1024 예약
		
		try {
			System.out.println("server Start!");
			ServerSocket ss = new ServerSocket(port); //socket 1
			
			while (true) {
				Socket s= ss.accept();//socket 2 시작과 동시에 여기까지 활성화
				OutputStream os = s.getOutputStream(); // net 통해서 출력
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date());// 서버측 날짜
				oos.writeObject("Hello Kgb");
				oos.flush();
				s.close();
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}

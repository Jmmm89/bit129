package ex02.net.tcp;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

// Server - socket 2�� 
public class ServerTime {
	public static void main(String[] args) {
		int port = 7001; // 0~1024 ����
		
		try {
			System.out.println("server Start!");
			ServerSocket ss = new ServerSocket(port); //socket 1
			
			while (true) {
				Socket s= ss.accept();//socket 2 ���۰� ���ÿ� ������� Ȱ��ȭ
				OutputStream os = s.getOutputStream(); // net ���ؼ� ���
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date());// ������ ��¥
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

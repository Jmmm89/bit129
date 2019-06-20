package ex02.net.tcp;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

// Client - socket 1��
public class ClientTime {

	 public static void main(String[] args) {
		
		 String serverIP = "10.10.10.167"; //127.0.0.1 = �ڱ��ڽ�
		 int port = 7000;
		 Date date = null;
		 
		 try {
			Socket client = new Socket(serverIP, port);
			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			System.out.println("Server�� ��¥/�ð� Ȯ�� ... �� ������ Ŭ���̾�Ʈ");
			
			date = (Date) ois.readObject();
			System.out.println("���� �ð�  : "+ date + " �Դϴ�.");
			
			String hi = (String) ois.readObject();
			System.out.println( hi + " �Դϴ�.");
			ois.close();
			client.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		 
		 
	}
}

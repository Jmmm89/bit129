package ex01.net.tcp;

import java.net.*;
import java.io.*;
import java.util.*;

public class TcpMultiChatServer {

	HashMap clients; // key+value
	
	public TcpMultiChatServer() {//������
		clients = new HashMap(); // HashMap ��ü ����
		Collections.synchronizedMap(clients);//����ȭ
		
	}
	
	public void start() {
		ServerSocket ss = null; //����1
		Socket s = null; //����2
		
		try {
			ss = new ServerSocket(7777);
			System.out.println("���� ����");
			
			while(true) {
				s= ss.accept();
				System.out.println("[" + s.getInetAddress() + " : " + s.getPort() + "] ���� �����Ͽ����ϴ�.");
				ServerReceiver thread = new ServerReceiver(s); //����Ŭ����
				thread.start();
				
			}
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		
	} //start end
	
	public void sendToAll(String msg) { // ���� �޼ҵ�
		
		Iterator it = clients.keySet().iterator();// key �� ���
		
		while(it.hasNext()) { //hasnext �ݷ��Ǿ��� ���� ���� ã�´�
			
			try {
				DataOutputStream dos = (DataOutputStream)clients.get(it.next());
				dos.writeUTF(msg);
			} catch (IOException e) {e.printStackTrace();}
		}// while end
		
	}//sendToAll end
	
	
	class ServerReceiver extends Thread {
		
		Socket s; //Ŭ���̾�Ʈ ����
		DataInputStream dis;
		DataOutputStream dos;
		
		
		public ServerReceiver(Socket s) { //������ �޾ƿ��� ������
			this.s = s;
			
			try {
				dis = new DataInputStream(s.getInputStream());//��Ʈ��ũ ���ؼ� �б�
				dos = new DataOutputStream(s.getOutputStream());//��Ʈ��ũ ���ؼ� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		} //���� ���ù� �޼ҵ� end 

		@Override
		public void run() {
			String name =  "";
			try {
				name = dis.readUTF();
				sendToAll("#" + name + "���� �����ϼ̽��ϴ�. ");
				
				System.out.println(dos.toString().hashCode());
				clients.put(name, dos); // HashMap �ֱ�
				System.out.println("���� ���� ������ ���� : " + clients.size() + "�Դϴ�."); //�����ڼ� Ȯ��
				
				while(dis !=null) {
					sendToAll(dis.readUTF());
					
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				
				sendToAll("#" + name + "���� �����ϼ̽��ϴ�. ");
				clients.remove(name);
				
				System.out.println("[" + s.getInetAddress() + " : " + s.getPort() + "] ���� �Ͽ����ϴ�.");
			}
			
		}
		
		
		
	}//inner class end
	
	
	
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}
}

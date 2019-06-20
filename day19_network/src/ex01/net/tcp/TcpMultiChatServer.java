package ex01.net.tcp;

import java.net.*;
import java.io.*;
import java.util.*;

public class TcpMultiChatServer {

	HashMap clients; // key+value
	
	public TcpMultiChatServer() {//생성자
		clients = new HashMap(); // HashMap 객체 생성
		Collections.synchronizedMap(clients);//동기화
		
	}
	
	public void start() {
		ServerSocket ss = null; //소켓1
		Socket s = null; //소켓2
		
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 시작");
			
			while(true) {
				s= ss.accept();
				System.out.println("[" + s.getInetAddress() + " : " + s.getPort() + "] 에서 접속하였습니다.");
				ServerReceiver thread = new ServerReceiver(s); //유저클래스
				thread.start();
				
			}
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		
	} //start end
	
	public void sendToAll(String msg) { // 유저 메소드
		
		Iterator it = clients.keySet().iterator();// key 값 출력
		
		while(it.hasNext()) { //hasnext 콜렉션안의 다음 값을 찾는다
			
			try {
				DataOutputStream dos = (DataOutputStream)clients.get(it.next());
				dos.writeUTF(msg);
			} catch (IOException e) {e.printStackTrace();}
		}// while end
		
	}//sendToAll end
	
	
	class ServerReceiver extends Thread {
		
		Socket s; //클라이언트 소켓
		DataInputStream dis;
		DataOutputStream dos;
		
		
		public ServerReceiver(Socket s) { //소켓을 받아오는 생성자
			this.s = s;
			
			try {
				dis = new DataInputStream(s.getInputStream());//네트워크 통해서 읽기
				dos = new DataOutputStream(s.getOutputStream());//네트워크 통해서 쓰기
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		} //서버 리시버 메소드 end 

		@Override
		public void run() {
			String name =  "";
			try {
				name = dis.readUTF();
				sendToAll("#" + name + "님이 입장하셨습니다. ");
				
				System.out.println(dos.toString().hashCode());
				clients.put(name, dos); // HashMap 넣기
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + "입니다."); //접속자수 확인
				
				while(dis !=null) {
					sendToAll(dis.readUTF());
					
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				
				sendToAll("#" + name + "님이 퇴장하셨습니다. ");
				clients.remove(name);
				
				System.out.println("[" + s.getInetAddress() + " : " + s.getPort() + "] 에서 하였습니다.");
			}
			
		}
		
		
		
	}//inner class end
	
	
	
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}
}

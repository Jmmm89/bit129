package ex01.net.tcp;

import java.net.*;
import java.io.*;
import java.util.*;

public class TcpMultiChatClient {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : 대화명");
			System.exit(0);
		}//end if
		
		try {
			String ip = "10.10.10.168";
			Socket s = new Socket(ip,7777);
			System.out.println("서버에 연결됨");
			Thread send = new Thread(new ClientSender(s, args[0])); //inner class ↓ args[0]자리가 닉네임자리
			Thread reciever = new Thread(new ClientReciever(s));
			send.start();
			reciever.start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}//main end
	
	static class ClientSender extends Thread{ //inner class 1
		Socket s;
		DataOutputStream dos;
		String name;
		 public ClientSender(Socket s, String name) {
			 this.s = s;
			 try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
		@Override
		public void run() {
			
			Scanner scan = new Scanner(System.in);
			try {
				if(dos != null)dos.writeUTF(name);
				while ( dos != null ) dos.writeUTF("[" + name + "] " + scan.nextLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	static class ClientReciever extends Thread { //inner class 2
		
		Socket s;
		DataInputStream dis;
		
		public ClientReciever(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			while(dis != null) {
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) {
					e.printStackTrace();
				}//catch end
			}//while end
			
		}//run end
			}// clientRe end
	
	
}//tcpMCC end

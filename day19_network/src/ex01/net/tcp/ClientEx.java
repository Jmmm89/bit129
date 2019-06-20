package ex01.net.tcp;

import java.io.*;
import java.net.*;


public class ClientEx {

	public static void main(String[] args) {
		
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		Socket client = null; //클라이언트는 1개
		
		
		try {
			client = new Socket("localhost", 9999); // 127.0.0.1 or ip address
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				
			stin = new BufferedReader(new InputStreamReader(System.in));
			//출력 스트림
			
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			String outputMessage;
			
			while(true) {
				
				System.out.println("message intput : ");
				outputMessage = stin.readLine();
				
				if ( outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
					
				}//if end
				//키보드에서 읽은 문자열 전송
				bw.write("클라이언트 > " + outputMessage + "\n");
				bw.flush();
				
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
			}//while end
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				client.close();
			} catch (IOException e) {
			System.out.println("서버와 채팅중 오류발생");
				e.printStackTrace();
			}
			
		
		} 
	}
}

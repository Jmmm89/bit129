package ex01.net.tcp;

import java.io.*;
import java.net.*;

public class ServerEx {

	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		ServerSocket server = null; //서버 socket 1
		Socket client = null; //서버 socket 2
		
		System.out.println("Connected , Server here");
		try {
			server = new ServerSocket(9999);// 서버열림
			client = server.accept(); //응답대기
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream())); //클라이언트의 입력을 받아주는 버퍼드리더 생성
						
			//키보드로부터 입력 스트림(input)
			stin = new BufferedReader(new InputStreamReader(System.in));
			//클라이언트로부터의 출력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String inputMessage;
			while(true) {
				
				inputMessage = br.readLine();
				//클라이언트가 "EXIT"를 보내면 연결 종료↓
				if(inputMessage.equalsIgnoreCase("exit")) break;
				//클라이언트가 보낸 메시지 화면 출력↓
				System.out.println(inputMessage);
				//키보드에서 한 행의 문자열 읽음↓
				String outputMessage = stin.readLine(); //여기서 문자 입력을 받고
				//키보드에서 읽은 문자열 전송↓
				bw.write(" 서버 > " + outputMessage + "\n");
				bw.flush(); //flush 메소드는 받은 데이터를 출력한다.
				
			}//while end
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
				client.close();
				server.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류 발생!");
				e.printStackTrace();
			}
			
		}
	}
	
}

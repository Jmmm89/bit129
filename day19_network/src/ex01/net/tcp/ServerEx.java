package ex01.net.tcp;

import java.io.*;
import java.net.*;

public class ServerEx {

	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		ServerSocket server = null; //���� socket 1
		Socket client = null; //���� socket 2
		
		System.out.println("Connected , Server here");
		try {
			server = new ServerSocket(9999);// ��������
			client = server.accept(); //������
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream())); //Ŭ���̾�Ʈ�� �Է��� �޾��ִ� ���۵帮�� ����
						
			//Ű����κ��� �Է� ��Ʈ��(input)
			stin = new BufferedReader(new InputStreamReader(System.in));
			//Ŭ���̾�Ʈ�κ����� ��� ��Ʈ��
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String inputMessage;
			while(true) {
				
				inputMessage = br.readLine();
				//Ŭ���̾�Ʈ�� "EXIT"�� ������ ���� �����
				if(inputMessage.equalsIgnoreCase("exit")) break;
				//Ŭ���̾�Ʈ�� ���� �޽��� ȭ�� ��¡�
				System.out.println(inputMessage);
				//Ű���忡�� �� ���� ���ڿ� ������
				String outputMessage = stin.readLine(); //���⼭ ���� �Է��� �ް�
				//Ű���忡�� ���� ���ڿ� ���ۡ�
				bw.write(" ���� > " + outputMessage + "\n");
				bw.flush(); //flush �޼ҵ�� ���� �����͸� ����Ѵ�.
				
			}//while end
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
				client.close();
				server.close();
			} catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ���� �߻�!");
				e.printStackTrace();
			}
			
		}
	}
	
}

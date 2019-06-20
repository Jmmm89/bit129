package ex02.net.tcp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class SeverTest {

	public static void main(String[] args) {
		ServerSocket ss = null; //���� 1
		Socket s = null;        //���� 2     ������ ������ 2�� �ʿ��ϴ�
		System.out.println("���� ����");
		
		
		try {
			ss = new ServerSocket(9000); //������������ ��Ʈ��ȣ ����
			s= ss.accept(); // Ŭ���̾�Ʈ ���� ������
			
			// I/O
			InputStream is = s.getInputStream();// �о������
			OutputStream os = s.getOutputStream();
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			String msg = "�ȳ� Client";
			os.write(msg.getBytes());
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				s.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
		
	}
}
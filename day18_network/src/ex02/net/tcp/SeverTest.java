package ex02.net.tcp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class SeverTest {

	public static void main(String[] args) {
		ServerSocket ss = null; //소켓 1
		Socket s = null;        //소켓 2     서버는 소켓이 2개 필요하다
		System.out.println("서버 시작");
		
		
		try {
			ss = new ServerSocket(9000); //서버소켓으로 포트번호 생성
			s= ss.accept(); // 클라이언트 소켓 응답대기
			
			// I/O
			InputStream is = s.getInputStream();// 읽어오는쪽
			OutputStream os = s.getOutputStream();
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			String msg = "안녕 Client";
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
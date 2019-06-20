package ex02.net.tcp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class ClientTest {

	public static void main(String[] args) {
		
		Socket s = null;
		
		
		try {
			s= new Socket("10.10.10.168",9000);
			InputStream is = s.getInputStream();// 읽어오는쪽
			OutputStream os = s.getOutputStream();
		
			String str = "안녕 Server";
			os.write(str.getBytes());
		
		byte [] buffer = new byte[100];
		is.read(buffer);
		System.out.println(new String (buffer));
		
		
		
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try { s.close(); }catch(Exception e) {e.printStackTrace();}
		}
		
	}
}
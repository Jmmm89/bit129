package ex05.io;
import java.net.*;
import java.io.*;

public class UriCopy {
	public static void main(String[] args) throws MalformedURLException, IOException{
		
		URL url = new URL("https://postfiles.pstatic.net/MjAxOTA0MDRfMjE4/MDAxNTU0MzYyOTAxNzU1.UzgdX3dQsOExAFyDLxRqbclfWhzO7h93X8UzhiczpBkg.MMVZ6NbvHKvr7WG2UTghSF3qP_lYfgXi1mXWOqTB5msg.PNG.rnjsrldnd123/SE-cbf3a19d-20fe-48fd-afd5-4b86a09f74ab.png?type=w966");
		
		//�б� ��ü
		InputStream is = url.openStream();
		
		//���� ��ü
		OutputStream os = new FileOutputStream("naver.jpg"); // �����
		
		byte[] buffer = new byte[1024];
		
		while (true) {
			int inputData = is.read(buffer);
			
			if ( inputData == -1) break;
			
			os.write(buffer,0,inputData);
			
		}
		
		is.close();
		os.close();
		System.out.println("������ ���� ���� ����!");
	}
	
}

package ex05.io;
import java.io.*;



public class FileCopy {

	public static void main(String[] args) throws Exception{
		//�бⰴü - FileInputStream
		InputStream is = new FileInputStream("coal.jpg");
		
		//���ⰴü - FileOutputStream
		OutputStream os = new FileOutputStream("copy.jpg");
		
		byte[] buffer = new byte[1024 * 8];
		
		
		long start = System.currentTimeMillis(); 
		
		while(true) {
			int inputData = is.read(buffer); // buffer ũ�⸸ŭ �о����
			if(inputData == -1 ) break;
			os.write(buffer, 0,inputData);
		
		}//while end
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		is.close();
		os.close();
		System.out.println("���� ����!");
		
		
		//OutputStream 
	}
	
	
}

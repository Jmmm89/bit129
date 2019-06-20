package ex05.io;
import java.io.*;



public class FileCopy {

	public static void main(String[] args) throws Exception{
		//읽기객체 - FileInputStream
		InputStream is = new FileInputStream("coal.jpg");
		
		//쓰기객체 - FileOutputStream
		OutputStream os = new FileOutputStream("copy.jpg");
		
		byte[] buffer = new byte[1024 * 8];
		
		
		long start = System.currentTimeMillis(); 
		
		while(true) {
			int inputData = is.read(buffer); // buffer 크기만큼 읽어들임
			if(inputData == -1 ) break;
			os.write(buffer, 0,inputData);
		
		}//while end
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		is.close();
		os.close();
		System.out.println("복사 성공!");
		
		
		//OutputStream 
	}
	
	
}

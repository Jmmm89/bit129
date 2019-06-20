package ex05.io;

import java.io.*;
public class BinaryCopy {

		public static void main(String[] args) {
			
			File scr = new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\coal.jpg");
			File dist = new File("C:\\Users\\1027\\Downloads\\coal.jpg");
			
			FileInputStream fis = null;
			FileOutputStream fos = null;
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			int c;
			try {
			fis = new FileInputStream(scr);
			fos = new FileOutputStream(dist);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while ( (c = bis.read())!=-1) {
				bos.write((char)c);
			}//while end
		}catch (Exception e) {
			System.out.println("파일 복사 오류 발생!");
		}
	
		}
}

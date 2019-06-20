package ex01.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("example.txt", "rw"); //예외발생
		
		for (int i = 0; i <= 10; i++) {
			raf.seek(i * 100); //예외발생
			raf.writeInt(i);
			
		}
		System.out.println("성공!!");
		raf.close();
	}
}

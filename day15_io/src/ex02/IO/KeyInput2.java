package ex02.IO;

import java.io.InputStream;

public class KeyInput2 {
	public static void main(String[] args) throws Exception {
		
		int su1 = 0, su2 = 0;
		System.out.println("������ �Է� ���� ctrl + Z ��������.");
		
		
		while((su1 = System.in.read()) != -1) {
			System.out.println((char)su1 + "\t");
		}
		System.out.println();
	
}
}
package ex04.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) {
		 //������ ã���� ���� ���ܸ� ó�����ش� (���� Ȥ�� ����)
		Scanner scan = new Scanner(System.in);
		try {
			FileOutputStream os = new FileOutputStream("C:\\Users\\1027\\test.txt"); //������
			//FileOutputStream os = new FileOutputStream("test.txt"); �����
			while(true) {
				System.out.println("���ڿ� �Է� ��� : ");
				String str = scan.nextLine() + "\r\n";
				
				if ( str.toUpperCase().equals("EXIT\r\n")) break;
				
				os.write(str.getBytes()); //�����͸� ���Ͽ� ���ִºκ�
				System.out.println(str); //�Է¹��� �����͸� �״�� ���
				
				System.out.println("������ ���� ����!");
			}
			
			
			
		} catch (FileNotFoundException e) {
		} catch (Exception e1) {
		}
	}
}

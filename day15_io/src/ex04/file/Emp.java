package ex04.file;
import java.io.*;
import java.util.*;
public class Emp {
	 //������ ã���� ���� ���ܸ� ó�����ش� (���� Ȥ�� ����)
//	Scanner scan = new Scanner(System.in);
//	try {
//		FileOutputStream os = new FileOutputStream("C:\\Users\\1027\\test.txt"); //������
//		//FileOutputStream os = new FileOutputStream("test.txt"); �����
//		while(true) {
//			System.out.println("���ڿ� �Է� ��� : ");
//			String str = scan.nextLine() + "\r\n";
//			
//			if ( str.toUpperCase().equals("EXIT\r\n")) break;
//			
//			os.write(str.getBytes()); //�����͸� ���Ͽ� ���ִºκ�
//			System.out.println(str); //�Է¹��� �����͸� �״�� ���
//			
//			System.out.println("������ ���� ����!");
//		}
//		
//		
//		
//	} catch (FileNotFoundException e) {
//	} catch (Exception e1) {
//	}
//}
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\1027\\Emp.txt");
			while(true) {
				
				System.out.println("��� ���� �Է�");
				System.out.print("�̸� : ");
				String name = "�̸� : "+br.readLine()+"\r\n";
				System.out.println(name);
				System.out.print("���� : ");
				String rank = "���� : "+br.readLine()+"\r\n";
				System.out.println(rank);
				System.out.print("�μ� : ");
				String part = "�μ� : "+br.readLine()+"\r\n";
				System.out.println(part);
				
				file.write(name.getBytes());
				file.write(rank.getBytes());
				file.write(part.getBytes());
				
				System.out.println("���� ���� ����!");
				String Exit = br.readLine();
				if ( Exit.toUpperCase().equals("EXIT\r\n")) break;
			}
			
			
		} catch (FileNotFoundException e) {
			e.getMessage();
			e.printStackTrace();
		}catch(IOException e1) {
			e1.getMessage();
			e1.printStackTrace();
		}
	}
	
}

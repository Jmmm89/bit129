package ex02.IO;

import java.io.InputStream;

public class KeyInput {
	public static void main(String[] args) {
		
		InputStream is = System.in; // ǥ�� �Է�
		
		try {
			System.out.print("���� ���� �Է� ��� : ");
			int num = is.read()-48;	//���ܹ߻��� . '0' ~ '9' : 48 ~57(ASCII code)
			
			is.read(); is.read(); // �����߻�ó�� -�ڹٿ��� ���� 2����Ʈ ó����
			
			int num2 = is.read()-48;
			System.out.println(num+num2);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

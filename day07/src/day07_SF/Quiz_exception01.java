package day07_SF;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz_exception01 {
public static void main(String[] args) {
	// ���ڰ� �ƴ� ���� �Է� ������ , ������ �ƴ� �Ǽ� ������ �Է� ������ 
	// � ���� 0���� ���� �� ����.
	try {
	
	int a,b,div;
	
	System.out.print("�������� �ϴ� �μ��� �Է��ϼ��� : ");
	Scanner scan = new Scanner(System.in);
	
	a = scan.nextInt();
	
	b = scan.nextInt();
	
	System.out.println("���� : "+ a + " / " + b);
	div = a/b;
	System.out.print(" �� : " + div);
	}
	
	catch(InputMismatchException e) {
		System.out.println("���ڰ� �Էµƽ��ϴ�.");
		
	}
	catch(ArithmeticException e1) {
		System.out.println("� ���� 0���� ���� �� �����ϴ�.");
	}
}
}

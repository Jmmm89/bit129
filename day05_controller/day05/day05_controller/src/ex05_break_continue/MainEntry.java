package ex05_break_continue;

import java.util.Scanner;

public class MainEntry {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	char ch = ' ';
	String str = null;
	int count = 0;
	
	System.out.println(" �ƹ� ���̳� �Է��ϼ���."+ "'x' �� ������ ���α׷� Ż�� : ");
	
	while ( true ) { //���ѷ���
		str = scan.next(); 
		ch= str.charAt(0); 
//		ch = scan.next().charAt(0);
		 // ����Ż�ⱸ���� ����
		count = str.length();
		System.out.print( "�Է� ���� ���� ������ : " + count + " �� ");
		if ( ch == 'x') break;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

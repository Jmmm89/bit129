package day07_SF;

import java.util.Scanner;

public class Quiz_if01 {
public static void main(String[] args) {
	//����1] �빮�� <--> �ҹ��� ���� ���α׷� �ۼ�(if)
	char a;
    int a1;
    char A;
	System.out.println("====== �빮�� => �ҹ��� ���� ���α׷� =====");
	Scanner scan = new Scanner(System.in);
	System.out.print(" �빮�� �Է� : ");

	a = scan.next().charAt(0); //char �Է� ��ĳ��
	a1 = (int)a;
	
	System.out.println();
	
	if ( a1 < 100 ) {
		 a1+=32;
		A = (char)a1;
		 System.out.println(" �ҹ��� ���� : " + A );
	}
	
	
	
}
}

package day05.day05_controller.src.day05_controller;

import java.util.Scanner;

//������ ���

public class For_01 {
public static void main(String[] args) {
	
	 
	
	 System.out.print("���������� ����� �ܼ��� �Է��ϼ��� : ");
	 Scanner scan = new Scanner(System.in);
	 int dan = scan.nextInt();
	 
	 
	 for (int gu = 1; gu<=10; gu++) {
		 
		 System.out.println(dan+"*"+gu+"="+dan*gu);
	 }
	 
 	
}
}

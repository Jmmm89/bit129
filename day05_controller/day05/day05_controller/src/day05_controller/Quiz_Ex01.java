package day05.day05_controller.src.day05_controller;

import java.util.Scanner;

public class Quiz_Ex01 {
// ���� 1] 1����~10���� ����ϴ� ���α׷� �ۼ� (for��)
	// 1~100���� ���� ������ּ���
	
	public static void main(String[] args) {
		
		/*
		for(int c=1 ; c<=100; c++) {
		co(sum+=i)
			for(int b = 100 ; b>=1 ; b--)
		
				System.out.println(c+" + "+b);
				c b
				c bb~*100
			*/
		
	// ����3] 1~100���� �߿��� ¦���� ���࿡ 10���� ���
//	 int d = 0;
//		for (int c=1 ; c<= 100; c++) {
//			if (c % 2 == 0) {
//				
//				System.out.print(c);
//		
//				
				
 // ���� 4  1~100���� �߿��� 3�� ����� �հ� ������?
//		int total=0;
//		int a;
//		int count=0;
//		
//		for ( a = 1; a<=100; a++) {
//			if ( a % 3 == 0) {
//				total += a;
//				count++;
//				
//			}
//			System.out.println(total);
//			System.out.println(count);
//		}
//		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���ϴ� ���� �Է��Ͻÿ� : ");
		
		int a = scan.nextInt();
		int mulp;
		for( int i = 1 ; i<=9 ; i++  ) {
			
			mulp =a*i;
			System.out.println(a+"*"+i+":"+mulp);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

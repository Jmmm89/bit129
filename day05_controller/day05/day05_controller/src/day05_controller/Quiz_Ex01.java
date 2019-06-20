package day05.day05_controller.src.day05_controller;

import java.util.Scanner;

public class Quiz_Ex01 {
// 문제 1] 1부터~10까지 출력하는 프로그램 작성 (for문)
	// 1~100까지 합을 출력해주세요
	
	public static void main(String[] args) {
		
		/*
		for(int c=1 ; c<=100; c++) {
		co(sum+=i)
			for(int b = 100 ; b>=1 ; b--)
		
				System.out.println(c+" + "+b);
				c b
				c bb~*100
			*/
		
	// 문제3] 1~100까지 중에서 짝수를 한행에 10개씩 출력
//	 int d = 0;
//		for (int c=1 ; c<= 100; c++) {
//			if (c % 2 == 0) {
//				
//				System.out.print(c);
//		
//				
				
 // 문제 4  1~100까지 중에서 3의 배수의 합과 개수는?
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
		System.out.println("구구단 원하는 단을 입력하시오 : ");
		
		int a = scan.nextInt();
		int mulp;
		for( int i = 1 ; i<=9 ; i++  ) {
			
			mulp =a*i;
			System.out.println(a+"*"+i+":"+mulp);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

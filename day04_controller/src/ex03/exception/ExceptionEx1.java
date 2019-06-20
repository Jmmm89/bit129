package ex03.exception;

import java.util.Scanner;

public class ExceptionEx1 {
public static void main(String[] args) {
	

	
	try {
		System.out.println("x , y = ");
		int x = new Scanner(System.in).nextInt();	
		int y=  new Scanner(System.in).nextInt();
		System.out.println(x / y);
	} catch (Exception e) {
		System.out.println( "0으로 나눌 수 없습니다. ");
		
	} // try end

//사칙연산 프로그램 작성 (0예외처리하기) if , switch 이용
//	숫자 2개 입력 받고, 연산자 1개 입력 받아서 - + * /
//	result> 3
//	 		5
//	 		+
//	 		
//	 		3 +5 = 8 
	
	

	
	
}
}
//System.out.println("x , y = ");
//
//int x = new Scanner(System.in).nextInt();
//int y=  new Scanner(System.in).nextInt();
//
//
// if( y == 0 ) {
//	 System.out.println("0으로 나눌수 없습니다. ");
//	 System.exit(0);
// }

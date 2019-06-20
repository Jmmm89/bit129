package day07_SF;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz_exception01 {
public static void main(String[] args) {
	// 숫자가 아닌 문자 입력 됐을때 , 정수가 아닌 실수 데이터 입력 됐을때 
	// 어떤 수를 0으로 나눌 수 없다.
	try {
	
	int a,b,div;
	
	System.out.print("나누고자 하는 두수를 입력하세요 : ");
	Scanner scan = new Scanner(System.in);
	
	a = scan.nextInt();
	
	b = scan.nextInt();
	
	System.out.println("수식 : "+ a + " / " + b);
	div = a/b;
	System.out.print(" 값 : " + div);
	}
	
	catch(InputMismatchException e) {
		System.out.println("문자가 입력됐습니다.");
		
	}
	catch(ArithmeticException e1) {
		System.out.println("어떤 수를 0으로 나눌 수 없습니다.");
	}
}
}

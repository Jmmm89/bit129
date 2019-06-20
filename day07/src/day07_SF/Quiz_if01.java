package day07_SF;

import java.util.Scanner;

public class Quiz_if01 {
public static void main(String[] args) {
	//과제1] 대문자 <--> 소문자 변경 프로그램 작성(if)
	char a;
    int a1;
    char A;
	System.out.println("====== 대문자 => 소문자 변경 프로그램 =====");
	Scanner scan = new Scanner(System.in);
	System.out.print(" 대문자 입력 : ");

	a = scan.next().charAt(0); //char 입력 스캐너
	a1 = (int)a;
	
	System.out.println();
	
	if ( a1 < 100 ) {
		 a1+=32;
		A = (char)a1;
		 System.out.println(" 소문자 변경 : " + A );
	}
	
	
	
}
}

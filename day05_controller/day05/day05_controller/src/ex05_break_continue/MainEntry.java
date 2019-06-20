package ex05_break_continue;

import java.util.Scanner;

public class MainEntry {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	char ch = ' ';
	String str = null;
	int count = 0;
	
	System.out.println(" 아무 값이나 입력하세요."+ "'x' 를 누르면 프로그램 탈출 : ");
	
	while ( true ) { //무한루프
		str = scan.next(); 
		ch= str.charAt(0); 
//		ch = scan.next().charAt(0);
		 // 루프탈출구문을 넣자
		count = str.length();
		System.out.print( "입력 받은 문자 갯수는 : " + count + " 개 ");
		if ( ch == 'x') break;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

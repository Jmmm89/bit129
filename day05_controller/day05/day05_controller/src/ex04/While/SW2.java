package ex04.While;

import java.util.Scanner;

public class SW2 {
public static void main(String[] args) {
	
	/*
	 * for ( int a=1; a < 4 ; a++ ){
	 * Sysout( a + "\t" );
	 * }
	 * 
	 * ==>
	 * int a = 1;
	 * While ( a < 4 ) {
	 *    Sysout( a + "\t" );
	 *    a++;  //증감식이 여기에온다
	 *    }
	 * 
	 * 
	 * 
	 * While (조건) {
	 * 
	 *  반복 실행문;
	 *  
	 *  }
	 *  int a = 1;
	 while ( a < 4 ) {
		 System.out.print(a + "\t ");
		 a++;
		 
		  do {
		  
		       반복실행문;
		       } while (조건); (; 반드시 찍자)
	 */
	System.out.println("**********구구단 출력기 **********");
	System.out.println("출력하고자 하는 단을 입력하세요 : ");  
	int g = new Scanner(System.in).nextInt();
	System.out.println(g + " 단 ");
	 int i = 1;
	 
		 while ( i <= 9) {
		 System.out.print( g + " * " + i + " = " + g*i+"  " );
		 i++;
	 
	 }
}
}

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
	 *    a++;  //�������� ���⿡�´�
	 *    }
	 * 
	 * 
	 * 
	 * While (����) {
	 * 
	 *  �ݺ� ���๮;
	 *  
	 *  }
	 *  int a = 1;
	 while ( a < 4 ) {
		 System.out.print(a + "\t ");
		 a++;
		 
		  do {
		  
		       �ݺ����๮;
		       } while (����); (; �ݵ�� ����)
	 */
	System.out.println("**********������ ��±� **********");
	System.out.println("����ϰ��� �ϴ� ���� �Է��ϼ��� : ");  
	int g = new Scanner(System.in).nextInt();
	System.out.println(g + " �� ");
	 int i = 1;
	 
		 while ( i <= 9) {
		 System.out.print( g + " * " + i + " = " + g*i+"  " );
		 i++;
	 
	 }
}
}

package ex04.While;

import java.util.Scanner;

public class SW3 {
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
 
	
	
	 int g = 2; 
	 
	
	 do
	 {
		 int i = 1;
	 
	 
	 do {
		 System.out.print( g + " * " + i + " = " + g*i+"  "+"\n\n" );
	 
	 }while ( i++ <= 8);
		 
	 
	 
	 }while ( g++ <= 8);
	 
}
}

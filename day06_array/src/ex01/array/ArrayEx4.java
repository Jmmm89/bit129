package ex01.array;

import java.util.Scanner;

public class ArrayEx4 {
public static void main(String[] args) {
  int NUM = 0; int sum = 0;
  System.out.println(" �ش� ���� �����ΰ� : ");
  NUM = new Scanner(System.in).nextInt();
  int[] a = new int [NUM]; // �迭���� int�� �����͸�	
	
  //System.out.println(a.length);
  
 
  for (int i = 0; i < a.length; i ++) {
	  System.out.println( (i+1)+ "���� ������ = ");
	  a[i] = new Scanner(System.in).nextInt();
	  sum += a[i];
  }
  System.out.println("sum = " + sum);
  for ( int i = 0; i < a.length; i ++) {
	  System.out.println( "a["+i+"]"+a[i] );
  }
}
}

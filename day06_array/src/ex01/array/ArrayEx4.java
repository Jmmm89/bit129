package ex01.array;

import java.util.Scanner;

public class ArrayEx4 {
public static void main(String[] args) {
  int NUM = 0; int sum = 0;
  System.out.println(" 해당 달은 몇일인가 : ");
  NUM = new Scanner(System.in).nextInt();
  int[] a = new int [NUM]; // 배열수는 int형 데이터만	
	
  //System.out.println(a.length);
  
 
  for (int i = 0; i < a.length; i ++) {
	  System.out.println( (i+1)+ "일의 강수량 = ");
	  a[i] = new Scanner(System.in).nextInt();
	  sum += a[i];
  }
  System.out.println("sum = " + sum);
  for ( int i = 0; i < a.length; i ++) {
	  System.out.println( "a["+i+"]"+a[i] );
  }
}
}

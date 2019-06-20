package day08_note;

import java.util.Scanner;

public class Sf01 {
	public static void main(String[] args) {
		
		System.out.println("신상정보");
		info();
		System.out.println("끝");
		System.out.print("절대값출력 : ");
		abs(-100);
//		System.out.println("max = " + max());
////		int m = max();
//		System.out.println("max = " + m);
		
	}
public static void info() {
	System.out.println("JM");
	System.out.println("2005");
	System.out.println("NW");
}
// 문제2 ] abs(int x) {절대값 출력하는 함수 만들기}
	
public static void abs(int x) {
	
	if (x < 0)
		x*= -1;
	System.out.println(x);}
	
	// 문제3 ] max() { 두개 정수 입력 받아서 큰수 리턴하는 함수 }
	
//public static int max () {
//	 int x = new Scanner(System.in).nextInt();
//	 int y = new Scanner(System.in).nextInt();
//	 
//	 if ( x > y) return x;
//	 else if ( x < y) return y;
//	   
}




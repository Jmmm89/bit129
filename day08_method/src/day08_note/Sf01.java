package day08_note;

import java.util.Scanner;

public class Sf01 {
	public static void main(String[] args) {
		
		System.out.println("�Ż�����");
		info();
		System.out.println("��");
		System.out.print("���밪��� : ");
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
// ����2 ] abs(int x) {���밪 ����ϴ� �Լ� �����}
	
public static void abs(int x) {
	
	if (x < 0)
		x*= -1;
	System.out.println(x);}
	
	// ����3 ] max() { �ΰ� ���� �Է� �޾Ƽ� ū�� �����ϴ� �Լ� }
	
//public static int max () {
//	 int x = new Scanner(System.in).nextInt();
//	 int y = new Scanner(System.in).nextInt();
//	 
//	 if ( x > y) return x;
//	 else if ( x < y) return y;
//	   
}




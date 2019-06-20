package ex01.If;

import java.util.Scanner;

public class Controller_If3 {
	public static void main(String[] args) {
	System.out.println("integer su1, su2 data input : ");
		
		Scanner sc = new Scanner(System.in);
	
//		int su1 = new Scanner(System.in).nextInt();
//		int su2 = new Scanner(System.in).nextInt();
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		int avg = (su1+su2) / 2 ; //평균점수
		String msg = null;
		
		//불합격 - 40점 , 1회 기회 제공 - 75점 , 2회 기회 제공 - 60점
//		 2개 점수 합산이
		if( avg >= 40 ) msg = "불합격";
		else if (avg > 75) msg = "합격";
		else if ((avg >40)&& (avg<=60)) msg = "1회 기회 제공";
		
	else if ( avg > 60 ) msg = "2회 기회 제공";
	 System.out.println("\n\n" + avg + " ---->" + msg);
		
	}
		
		
}


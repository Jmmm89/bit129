package ex02.Switch;

import java.util.Scanner;

public class Quiz_Ex05 {
public static void main(String[] args) {
	
	System.out.print("마지막날을 구하고자 하는달을 정수로 입력하세요 :  ");
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	String montH;
	
	switch (month) {
	case 1 : case 3 : case 5 : case 7 : case 8 : case 10: 
	case 12 :  System.out.println("31일"); break;
	case 2 : 
		Scanner scan = new Scanner(System.in);
		 System.out.println("구하고자 하는 연도를 입력하시오 : ");
		int year = new Scanner(System.in).nextInt();
		 boolean flag = false;
		 String str = "";
		 
		 if ( year % 4 == 0) 
		  if ((year % 100 != 0 )||( year % 400 == 0 )) 
				flag = true;
		 
		 str = ( flag == true) ? "윤년" : "평년";
			 System.out.println(year + "년 ====>" +str );
	case 29 : System.out.println("29일"); break;
	case 28 : System.out.println("28일"); break;
	
			 
	case 4 : case 6 : case 9 : case 11 : System.out.println("30일"); break;
	 
	default : System.out.println("원하는 달 다시 정수로 입력해주세요");
	
	
	}
	
}
}


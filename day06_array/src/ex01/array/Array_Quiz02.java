package ex01.array;

import java.util.Scanner;

public class Array_Quiz02 {
public static void main(String[] args) {
	//문제 2 ] 특정달의 강수량 평균을 구하는 프로그램 작성
	//   
	
	int dayNum , sum = 0;
	double avg = 0.0;
	
	Scanner scan = new Scanner(System.in);
    System.out.println("====4월의 강수량 구하는 프로그램====");
    System.out.print("4월의 우천일 총 일수 : ");
    
    dayNum = scan.nextInt();
    
    int [] day = new int[dayNum];
    
    for ( int i = 0; i< day.length; i++) {
    	System.out.println((i+1)+"번째 우천일의 강수량 : ");
    	day[i] = scan.nextInt();
    	sum += day[i];
    	
    }
    
	 avg = (double)sum/30.0;
	 System.out.println(" 4월의 강수량 : " + avg);
 
	 scan.close();
}
}

package ex01.array;

import java.util.Scanner;

public class Array_Quiz02 {
public static void main(String[] args) {
	//���� 2 ] Ư������ ������ ����� ���ϴ� ���α׷� �ۼ�
	//   
	
	int dayNum , sum = 0;
	double avg = 0.0;
	
	Scanner scan = new Scanner(System.in);
    System.out.println("====4���� ������ ���ϴ� ���α׷�====");
    System.out.print("4���� ��õ�� �� �ϼ� : ");
    
    dayNum = scan.nextInt();
    
    int [] day = new int[dayNum];
    
    for ( int i = 0; i< day.length; i++) {
    	System.out.println((i+1)+"��° ��õ���� ������ : ");
    	day[i] = scan.nextInt();
    	sum += day[i];
    	
    }
    
	 avg = (double)sum/30.0;
	 System.out.println(" 4���� ������ : " + avg);
 
	 scan.close();
}
}

package ex02.Switch;

import java.util.Scanner;

public class Controller_Switch4 {
public static void main(String[] args) {
	
	System.out.println("input jumsu(k,e,c) =  ");
	Scanner sc = new Scanner(System.in);
	int total = ( sc.nextInt() + sc.nextInt() + sc.nextInt() );
	double avg = total / 3.0;
	char grd;
	
	switch ((int)avg) {
	case 100 : 
	case 90 : grd = 'A'; break;
	case 80 : grd = 'B'; break;
	case 70 : grd = 'C'; break;
	case 60: grd = 'D'; break;
	default : grd = 'F'; 
	
	//브레이크가 없으면 다음값까지 출력
	
	}
	System.out.println("\n\n" + total + " --> " + grd);
	System.out.println(avg + "평균 --->"+ grd + "학점" );
}
}


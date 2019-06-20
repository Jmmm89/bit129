package ex04.While;

import java.util.Scanner;

public class SW4 {
public static void main(String[] args) {
	
	int myNum; //변수선언은 do ~ while 밖에서
    char grd = ' ';
    
    do {
    	System.out.println("점수를 입력해 주세요 : ");
    	myNum = new Scanner(System.in).nextInt();
    
    }while(myNum < 0 || myNum > 101 );
    
 		switch (myNum / 10) {
 
 		case 10 :
 		case 9 : grd = 'A'; break;
 		case 8 : grd = 'B'; break;
 		case 7 : grd = 'C'; break;
 		case 6 : grd = 'D'; break;
 		default: grd = 'F'; break;
	
}
	  System.out.println(" 당신의 점수는 " + myNum + "이고" + "학점은 " + "====>" + grd + "입니다.");
}
}

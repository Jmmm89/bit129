package ex04.While;

import java.util.Scanner;

public class SW5 {
public static void main(String[] args) {
//	문제6]이름 과 점수 3개 (k,e,c) 0~100 사이 입력받아서 총점 평균 구하는 프로그램 작성
	int total, k, e, c; //변수선언은 do ~ while 밖에서
    double avg;
    System.out.print("이름을 입력해 주세요 : ");
    String name = new Scanner(System.in).next();
    char op = ' ';
    
    do {
    	System.out.println("점수를 입력해 주세요 \n\n 국어: ");
    	k = new Scanner(System.in).nextInt();
    }while(k < 0 || k >  100 );
    	
    do {
    	System.out.println(" 영어 : ");
    	e = new Scanner(System.in).nextInt();
    }while(e < 0 || e >  100 );
    	
    	do {
    		System.out.println(" 전산 : ");
        	c = new Scanner(System.in).nextInt();
    	}while(c < 0 || c >  100 );
    	
//    	do {
//    		System.out.println("연산자 [+-*/] ");
//    		op = new Scanner(System.in).next().charAt(0);
//    	}while((op = +)&&
    
    
    	

    

   
    
    total = k+e+c;
    avg = ((double)k+e+c)/3.0;
	

	  System.out.println( name + " 의 총점은 " + total + "이고" + "평균은 " + avg + "입니다.");
}
}

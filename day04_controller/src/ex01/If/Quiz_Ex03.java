package ex01.If;

import java.util.Scanner;

public class Quiz_Ex03 {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("전산 -영어 - 국어 점수를 차례대로 입력하시오. ");
	int com, eng, kor, avg;
	String str = null;
	
	com = scan.nextInt();
	eng = scan.nextInt();
	kor = scan.nextInt();
	avg = (com+eng+kor)/3;
	
	if((com<=40)||(eng<=40)||(kor<=40)) str = "과락";
	else if (avg>=60) str = "합격";
	
	else{
		str="불합격";
	}
	  System.out.printf("결과 : %s ", str );
	
	}    
}

// 문제3] 전산 영어 국어 점수 입력 받아서 평균 60 점이상
//	각 과목 과락 40점(&&연산) 이하이면 과목 불합격 처리하는 프로그램 작성

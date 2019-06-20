package ex02.Switch;

import java.util.Scanner;

public class Quiz_Ex04 {
public static void main(String[] args) {
//	짝, 홀수 판정 switch~ case 로 만들기
	
	System.out.print("숫자를 입력하세요 : ");
	int myNum = new Scanner(System.in).nextInt();
	
	switch(myNum % 2) {
	case 0 : 
		System.out.println(" 짝수 입니다 ");
		break;
	
	case 1 : 
		System.out.println(" 홀수 입니다 ");
		break;
		
		default :
			System.out.println(" 오류입니다 ");
	
		}
	}
}


/*
 * System.out.println("integer data input : ");
		
		int su = new Scanner(System.in).nextInt();

		if (su % 2 == 0) {
			System.out.println("짝수");
			if( su > 0 ) {
				System.out.println("양수");
			}else if ( su < 0 ) {
				System.out.println("음수");
			} else {
				System.out.println("0");
			}

		} else {
			System.out.println("홀수");
			if( su > 0 ) {
				System.out.println("양수");
			}else if ( su < 0 ) {
				System.out.println("음수");
			} else {
				System.out.println("0");
			}
		}
 */

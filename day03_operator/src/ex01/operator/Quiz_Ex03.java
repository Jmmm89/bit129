package ex01.operator;

import java.util.Scanner;

public class Quiz_Ex03 {
// 다음을 입력 받아서 출력하는 프로그램 작성
//	이름, 국어, 영어, 전산 점수 입력 받아서 출력
//	총점, 평균까지 출력
	
//	 result > 
//	 이도연님의 성적표 *******
//	 국어 : 100, 영어 : 100, 전산 : 100
//	 총점 : 300, 평균 : 100.00
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하시오 : ");
		String name = scan.next();
		System.out.print("성적을 입력하시오 : "+ "국어/영어/전산"+"");
		System.out.println();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int pro = scan.nextInt();
		int sum = (kor+eng+pro);
		float average = sum/3f;
		System.out.println(name+"님의 성적표 *****");
		System.out.println("국어 : " + kor +" "+ "영어 : " + eng +" "+ "전산 : " + pro+" ");	
		System.out.printf("총점 : %d \t  평균 : %.2f" ,sum,average);
		
		
	/*
	 * int kor, eng, com;
	 * 
	 * system.out.print("name = ");
	 * String name = sc. nextLine();
	 * 
	 * System. out. print ( "kor, eng, come score = ");
	 * kor = sc.nextInt();
	 * eng = sc.nextInt();
	 * com = sc. nextInt();
	 * 
	 * int total = sc.nextInt() + sc.nextInt ()  + sc.nextInt();
	 * double avg = totla / 3.0;	
	 */
		
		
	}
}


    

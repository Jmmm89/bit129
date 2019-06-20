package ex01.If;

import java.util.Scanner;

public class Quiz_Ex01 {

		public static void main(String[] args) {
//			문제1] 이름, 점수 3개(국어, 영어, 전산)
//			총점, 평균, 학점(평점) 구하는 프로그램 작성
//			100~90 a 89 ~80 b 70~70 c 69~60 d else f
			
			Scanner scan = new Scanner(System.in);
			System.out.print("이름을 입력하시오 : ");
			String name = scan.next();
			System.out.print("성적을 입력하시오 : "+ "국어/영어/전산"+"");
			System.out.println();
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int pro = scan.nextInt();
			int sum = (kor+eng+pro);
			float avg = sum/3f;
			String grd = null;
			if(avg >= 90) grd = "A";
			else if ((avg<= 89)&& (avg > 80)) grd = "B"; //(avg >=80)
			else if ((avg<= 79)&& (avg > 70)) grd = "C";
			else if ((avg<= 69)&& (avg > 60)) grd = "D";
			else if (avg < 60) grd = "F";
			System.out.println("\n\n*****"+name+"님의 성적표 *****");
			System.out.println("국어 : " + kor +" "+ "영어 : " + eng +" "+ "전산 : " + pro+" ");	
			System.out.printf("총점 : %d \t  평균 : %.2f 평점 : %s " ,sum,avg,grd);
			
			
			
			
		}
}

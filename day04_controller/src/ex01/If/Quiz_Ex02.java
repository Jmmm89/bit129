package ex01.If;

import java.util.Scanner;

public class Quiz_Ex02 {

		public static void main(String[] args) {
//			문제2] 윤년/평년 판정 프로그램
//			if ( year % 4 == 0 )
//			 if (year % 100 != 0 ) || if ( year % 400 != 0 ) 
//			    "윤년"
			/*
			 Scanner scan = new Scanner(System.in);
			 System.out.println("구하고자 하는 연도를 입력하시오 : ");
			 int year = scan.nextInt();
			 if ( year % 4 == 0) 
			  if ((year % 100 != 0 )||( year % 400 == 0 )) 
					 System.out.println("해당 연도는 "+"\n\n윤년입니다");
				 else  {
					 System.out.println("해당 연도는 "+ "\n\n평년입니다");
				 }
					 */
			 Scanner scan = new Scanner(System.in);
			 System.out.println("구하고자 하는 연도를 입력하시오 : ");
			 int year = scan.nextInt();
			 boolean flag = false;
			 String str = "";
			 
			 if ( year % 4 == 0) 
			  if ((year % 100 != 0 )||( year % 400 == 0 )) 
					flag = true;
			 
			 str = ( flag == true) ? "윤년" : "평년";
				 System.out.println(year + "년 ====>" +str );
					 
				 }
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
			
			
			
/*
			
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
			
			
			Scanner scan = new Scanner(System.in);
	System.out.println("전산 -영어 - 국어 점수를 차례대로 입력하시오. ");
	int com, eng, kor, avg;
	String str = null;
	
	com = scan.nextInt();
	eng = scan.nextInt();
	kor = scan.nextInt();
	avg = (com+eng+kor)/3;
	
	if((com<40)&&(eng<40)&&(kor<40)) str = "과락";
	else if (avg>60) str = "합격";
	
	else{
		str="불합격";
	}
	  System.out.printf("결과 : %s ", str );
			
	*/		
			
		}


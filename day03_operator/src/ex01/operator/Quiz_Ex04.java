package ex01.operator;

import java.util.Scanner;

public class Quiz_Ex04 {
  public static void main(String[] args) {
	
	  // 문제3] 숫자입력받아서 양수인가 음수인가 0인가 출력
	  
	  Scanner scan = new Scanner(System.in);
	  System.out.println("======숫자를 입력하세요======");
	  int Mynum = scan.nextInt();
	  String str = (Mynum > 0) ? "양수" : (Mynum == 0) ? "0" : "음수";
	  System.out.println(str);
	  
	  
	  /* 삼항 (조건?) 참 : 거짓;
		 * System.out.print("int data input : " );
		 * int su - new Scanner(System.in).nextInt();	
		 * String str = (su % 2 == 0) ? "짝수" : "홀수 " ;
		 *                 ~ 조건 ~     ~ 참 ~  ~ 거짓 ~
		 *         
		 *               ( su % 2 != 0)
		 * System.out.println( su + " ==> " + str);
		 * 
		 * int x = 3 , y = 5 , result;
		 * result = (x > y) ? x : y;
		 * 
		 * int x =3 , y =5 z =7;
		 * int max ; 
		 * max = (x>y) ?  x :(y>z) ? y: z;
		 * System.out.print(max);
		 */
}
}

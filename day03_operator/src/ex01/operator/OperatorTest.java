package ex01.operator;

import java.util.Scanner;

//최단산쉬관논삼대콤
public class OperatorTest {
	public static void main(String[] args) {

	}
}

/*
 * 
 * package ex02.operator;
 * 
 * //최단산쉬관논삼대콤 public class OperatorTest { public static void main(String[]
 * args) {
 * 
 * //단항연산자 : 증감==> ++,--, ~(틸드), .... int x = 10, y; //y= x++; // 후위연산 : 대입먼저,
 * 연산나중 //y = ++x; // 전위연산 : 연산먼저, 대입나중
 * 
 * //y= x--;
 * 
 * x++; y=x;
 * 
 * System.out.println("x = " + x + "\ty =" +y); }// 메끝 }// 클끝
 */

/*
 * public class OperatorTest { public static void main(String[] args) { //단항연산자
 * : 증감==> ++,--, ~(틸드), ....
 * 
 * 
 * int x = 10, y;
 * 
 * y = ~x; //비트부정 : -(원래값 +1) ==>출력결과
 * 
 * System.out.println("x = " + x + "\ty =" +y); // stack heap static 메모리의 이해
 * 
 * 
 * 
 * // 산술연산자 : + - * / % ^
		int x = 10, y = 20;
		int gob = x * y;

		System.out.println("x * y =" + gob);
		System.out.println("x * y =" + (x * y));
		System.out.println(x + " * " + y + " = " + (x * y));

		System.out.println("(3 + 4) * 5 = " + (3+4*5));
		System.out.println("\n\n(3 + 4) * 5 = " + ((3+4)*5));
		
		System.out.println("\n7 / 3 = " + (7/3));
		System.out.println("7%3="+(7%3));
		
		//정수( + - * / % .........) 정수 연산 정수 는 정수
		System.out.println("\n7 / 3 = " + (7/3));
		System.out.println("7 / 3.0 = " + (7/3.0));
		System.out.println("7. / 3. = " + (7./3.));
		
		
		논리연산자 ㅇㅖ제
		/*		int x= 4, y = 7;
		System.out.println(x|y);
		System.out.println(x&y);
		System.out.println(x^y);
		*/
//논리연산자 : &, &&(and 둘다 참일때만o), |, ||(or둘중에 하나만참이어도o), ^(xor하나만참일때o) , !(not반대로)
/*  앞이 거짓이면 &&연산자는 더이상 수행하지 않음
*  앞이 참이면 || 연산자는 더이상 수행하지 않음
*  
*    
*  /* 삼항 (조건?) 참 : 거짓;
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
package ex01.operator;

import java.util.Scanner;

public class OperationTest2 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	 
		// next() vs nextLine()
	System.out.print("string input : ");
	   //String s1 = sc.next();
	String s1 = sc.nextLine();
	   System.out.println(s1);
	   
	   System.out.println("===================");
	   System.out.println("integer , double data input : ");
	   int num = sc.nextInt();
	   double num2 = sc.nextDouble();
	   
	   System.out.println(num+ ", " +num2);
	   
	   
	   
	   sc.close();
	}

}













/*	
//관계 연산자 : > ,< , >=, <=, ==, !=

	int x= 20, y= 20;
	
	if (x != y) // x가 y보다 크다면?
		System.out.println("같지 않습니다");
	else
		System.out.println("같습니다");
		
	*/













/*package ex01.operator;

public class OperationTest2 {
	public static void main(String[] args) {
		
	//shift 연산자 : << ,>> , <<<
		
		int x = 8, result;
		//result = x << 2; // <-- left shift 2칸민다
		// 8 * 2^2  =  원래값 x2^비트수
		result = x >> 3;
		//원래값 / 2^비트수  8/2^3 =1
		
//		System.out.println("left shift result : "+ result); // 32
		System.out.println("right shift result : "+ result);
		
		
		
		
//		System.out.println(7/3); //몫
//		System.out.println(7%3); // 나머지
	}

}
*/
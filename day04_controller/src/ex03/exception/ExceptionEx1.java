package ex03.exception;

import java.util.Scanner;

public class ExceptionEx1 {
public static void main(String[] args) {
	

	
	try {
		System.out.println("x , y = ");
		int x = new Scanner(System.in).nextInt();	
		int y=  new Scanner(System.in).nextInt();
		System.out.println(x / y);
	} catch (Exception e) {
		System.out.println( "0���� ���� �� �����ϴ�. ");
		
	} // try end

//��Ģ���� ���α׷� �ۼ� (0����ó���ϱ�) if , switch �̿�
//	���� 2�� �Է� �ް�, ������ 1�� �Է� �޾Ƽ� - + * /
//	result> 3
//	 		5
//	 		+
//	 		
//	 		3 +5 = 8 
	
	

	
	
}
}
//System.out.println("x , y = ");
//
//int x = new Scanner(System.in).nextInt();
//int y=  new Scanner(System.in).nextInt();
//
//
// if( y == 0 ) {
//	 System.out.println("0���� ������ �����ϴ�. ");
//	 System.exit(0);
// }

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
//���� ������ : > ,< , >=, <=, ==, !=

	int x= 20, y= 20;
	
	if (x != y) // x�� y���� ũ�ٸ�?
		System.out.println("���� �ʽ��ϴ�");
	else
		System.out.println("�����ϴ�");
		
	*/













/*package ex01.operator;

public class OperationTest2 {
	public static void main(String[] args) {
		
	//shift ������ : << ,>> , <<<
		
		int x = 8, result;
		//result = x << 2; // <-- left shift 2ĭ�δ�
		// 8 * 2^2  =  ������ x2^��Ʈ��
		result = x >> 3;
		//������ / 2^��Ʈ��  8/2^3 =1
		
//		System.out.println("left shift result : "+ result); // 32
		System.out.println("right shift result : "+ result);
		
		
		
		
//		System.out.println(7/3); //��
//		System.out.println(7%3); // ������
	}

}
*/
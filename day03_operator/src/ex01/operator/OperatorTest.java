package ex01.operator;

import java.util.Scanner;

//�ִܻ꽬��������
public class OperatorTest {
	public static void main(String[] args) {

	}
}

/*
 * 
 * package ex02.operator;
 * 
 * //�ִܻ꽬�������� public class OperatorTest { public static void main(String[]
 * args) {
 * 
 * //���׿����� : ����==> ++,--, ~(ƿ��), .... int x = 10, y; //y= x++; // �������� : ���Ը���,
 * ���곪�� //y = ++x; // �������� : �������, ���Գ���
 * 
 * //y= x--;
 * 
 * x++; y=x;
 * 
 * System.out.println("x = " + x + "\ty =" +y); }// �޳� }// Ŭ��
 */

/*
 * public class OperatorTest { public static void main(String[] args) { //���׿�����
 * : ����==> ++,--, ~(ƿ��), ....
 * 
 * 
 * int x = 10, y;
 * 
 * y = ~x; //��Ʈ���� : -(������ +1) ==>��°��
 * 
 * System.out.println("x = " + x + "\ty =" +y); // stack heap static �޸��� ����
 * 
 * 
 * 
 * // ��������� : + - * / % ^
		int x = 10, y = 20;
		int gob = x * y;

		System.out.println("x * y =" + gob);
		System.out.println("x * y =" + (x * y));
		System.out.println(x + " * " + y + " = " + (x * y));

		System.out.println("(3 + 4) * 5 = " + (3+4*5));
		System.out.println("\n\n(3 + 4) * 5 = " + ((3+4)*5));
		
		System.out.println("\n7 / 3 = " + (7/3));
		System.out.println("7%3="+(7%3));
		
		//����( + - * / % .........) ���� ���� ���� �� ����
		System.out.println("\n7 / 3 = " + (7/3));
		System.out.println("7 / 3.0 = " + (7/3.0));
		System.out.println("7. / 3. = " + (7./3.));
		
		
		�������� ������
		/*		int x= 4, y = 7;
		System.out.println(x|y);
		System.out.println(x&y);
		System.out.println(x^y);
		*/
//�������� : &, &&(and �Ѵ� ���϶���o), |, ||(or���߿� �ϳ������̾o), ^(xor�ϳ������϶�o) , !(not�ݴ��)
/*  ���� �����̸� &&�����ڴ� ���̻� �������� ����
*  ���� ���̸� || �����ڴ� ���̻� �������� ����
*  
*    
*  /* ���� (����?) �� : ����;
	 * System.out.print("int data input : " );
	 * int su - new Scanner(System.in).nextInt();	
	 * String str = (su % 2 == 0) ? "¦��" : "Ȧ�� " ;
	 *                 ~ ���� ~     ~ �� ~  ~ ���� ~
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
package ex01.operator;

import java.util.Scanner;

public class Quiz_Ex04 {
  public static void main(String[] args) {
	
	  // ����3] �����Է¹޾Ƽ� ����ΰ� �����ΰ� 0�ΰ� ���
	  
	  Scanner scan = new Scanner(System.in);
	  System.out.println("======���ڸ� �Է��ϼ���======");
	  int Mynum = scan.nextInt();
	  String str = (Mynum > 0) ? "���" : (Mynum == 0) ? "0" : "����";
	  System.out.println(str);
	  
	  
	  /* ���� (����?) �� : ����;
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
}
}

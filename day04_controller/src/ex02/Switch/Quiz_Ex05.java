package ex02.Switch;

import java.util.Scanner;

public class Quiz_Ex05 {
public static void main(String[] args) {
	
	System.out.print("���������� ���ϰ��� �ϴ´��� ������ �Է��ϼ��� :  ");
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	String montH;
	
	switch (month) {
	case 1 : case 3 : case 5 : case 7 : case 8 : case 10: 
	case 12 :  System.out.println("31��"); break;
	case 2 : 
		Scanner scan = new Scanner(System.in);
		 System.out.println("���ϰ��� �ϴ� ������ �Է��Ͻÿ� : ");
		int year = new Scanner(System.in).nextInt();
		 boolean flag = false;
		 String str = "";
		 
		 if ( year % 4 == 0) 
		  if ((year % 100 != 0 )||( year % 400 == 0 )) 
				flag = true;
		 
		 str = ( flag == true) ? "����" : "���";
			 System.out.println(year + "�� ====>" +str );
	case 29 : System.out.println("29��"); break;
	case 28 : System.out.println("28��"); break;
	
			 
	case 4 : case 6 : case 9 : case 11 : System.out.println("30��"); break;
	 
	default : System.out.println("���ϴ� �� �ٽ� ������ �Է����ּ���");
	
	
	}
	
}
}

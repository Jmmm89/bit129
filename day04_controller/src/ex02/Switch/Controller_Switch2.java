package ex02.Switch;

import java.util.Scanner;

public class Controller_Switch2 {
public static void main(String[] args) {
	
	System.out.println("���ø� �����ϼ��� (s,d,b,j) = ");
	Scanner sc = new Scanner(System.in);
	//String str = sc.next();
	//char ch = str.charAt(0);
	char ch = sc.next().charAt(0);//�Ȱ���
	
	switch (ch) {
	case 's' : System.out.print("����"); break;
	case 'd' : System.out.print("�뱸"); break;
	case 'b' : System.out.print("�λ�"); break;
	case 'j' : System.out.print("����"); break;
	
	default : 
		System.out.print("�߸� �������ϴ�. s,d,b,j �߿� �Է��ϼ���"); 
		System.exit(0);break;
		
	}
	System.out.println("�� (��) �����ϼ̽��ϴ�. ");
}
}

/*
 * 	System.out.println("���ø� �����ϼ��� (s,d,b,j) = ");
	Scanner sc = new Scanner(System.in);
	String ch = sc.next();
	
	switch (ch) {
	case "s" : System.out.print("����"); break;
	case "d" : System.out.print("�뱸"); break;
	case "b" : System.out.print("�λ�"); break;
	case "j" : System.out.print("����"); break;
	
	default : 
		System.out.print("�߸� �������ϴ�. s,d,b,j �߿� �Է��ϼ���"); 
		System.exit(0);break;
		
	}
	System.out.println("�� (��) �����ϼ̽��ϴ�. ");
 */
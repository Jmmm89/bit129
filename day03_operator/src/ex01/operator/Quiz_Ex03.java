package ex01.operator;

import java.util.Scanner;

public class Quiz_Ex03 {
// ������ �Է� �޾Ƽ� ����ϴ� ���α׷� �ۼ�
//	�̸�, ����, ����, ���� ���� �Է� �޾Ƽ� ���
//	����, ��ձ��� ���
	
//	 result > 
//	 �̵������� ����ǥ *******
//	 ���� : 100, ���� : 100, ���� : 100
//	 ���� : 300, ��� : 100.00
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = scan.next();
		System.out.print("������ �Է��Ͻÿ� : "+ "����/����/����"+"");
		System.out.println();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int pro = scan.nextInt();
		int sum = (kor+eng+pro);
		float average = sum/3f;
		System.out.println(name+"���� ����ǥ *****");
		System.out.println("���� : " + kor +" "+ "���� : " + eng +" "+ "���� : " + pro+" ");	
		System.out.printf("���� : %d \t  ��� : %.2f" ,sum,average);
		
		
	/*
	 * int kor, eng, com;
	 * 
	 * system.out.print("name = ");
	 * String name = sc. nextLine();
	 * 
	 * System. out. print ( "kor, eng, come score = ");
	 * kor = sc.nextInt();
	 * eng = sc.nextInt();
	 * com = sc. nextInt();
	 * 
	 * int total = sc.nextInt() + sc.nextInt ()  + sc.nextInt();
	 * double avg = totla / 3.0;	
	 */
		
		
	}
}


    
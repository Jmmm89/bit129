package ex01.If;

import java.util.Scanner;

public class Quiz_Ex03 {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("���� -���� - ���� ������ ���ʴ�� �Է��Ͻÿ�. ");
	int com, eng, kor, avg;
	String str = null;
	
	com = scan.nextInt();
	eng = scan.nextInt();
	kor = scan.nextInt();
	avg = (com+eng+kor)/3;
	
	if((com<=40)||(eng<=40)||(kor<=40)) str = "����";
	else if (avg>=60) str = "�հ�";
	
	else{
		str="���հ�";
	}
	  System.out.printf("��� : %s ", str );
	
	}    
}

// ����3] ���� ���� ���� ���� �Է� �޾Ƽ� ��� 60 ���̻�
//	�� ���� ���� 40��(&&����) �����̸� ���� ���հ� ó���ϴ� ���α׷� �ۼ�

package ex01.If;

import java.util.Scanner;

public class Quiz_Ex01 {

		public static void main(String[] args) {
//			����1] �̸�, ���� 3��(����, ����, ����)
//			����, ���, ����(����) ���ϴ� ���α׷� �ۼ�
//			100~90 a 89 ~80 b 70~70 c 69~60 d else f
			
			Scanner scan = new Scanner(System.in);
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			String name = scan.next();
			System.out.print("������ �Է��Ͻÿ� : "+ "����/����/����"+"");
			System.out.println();
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int pro = scan.nextInt();
			int sum = (kor+eng+pro);
			float avg = sum/3f;
			String grd = null;
			if(avg >= 90) grd = "A";
			else if ((avg<= 89)&& (avg > 80)) grd = "B"; //(avg >=80)
			else if ((avg<= 79)&& (avg > 70)) grd = "C";
			else if ((avg<= 69)&& (avg > 60)) grd = "D";
			else if (avg < 60) grd = "F";
			System.out.println("\n\n*****"+name+"���� ����ǥ *****");
			System.out.println("���� : " + kor +" "+ "���� : " + eng +" "+ "���� : " + pro+" ");	
			System.out.printf("���� : %d \t  ��� : %.2f ���� : %s " ,sum,avg,grd);
			
			
			
			
		}
}

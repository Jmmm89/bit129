package ex01.If;

import java.util.Scanner;

public class Quiz_Ex02 {

		public static void main(String[] args) {
//			����2] ����/��� ���� ���α׷�
//			if ( year % 4 == 0 )
//			 if (year % 100 != 0 ) || if ( year % 400 != 0 ) 
//			    "����"
			/*
			 Scanner scan = new Scanner(System.in);
			 System.out.println("���ϰ��� �ϴ� ������ �Է��Ͻÿ� : ");
			 int year = scan.nextInt();
			 if ( year % 4 == 0) 
			  if ((year % 100 != 0 )||( year % 400 == 0 )) 
					 System.out.println("�ش� ������ "+"\n\n�����Դϴ�");
				 else  {
					 System.out.println("�ش� ������ "+ "\n\n����Դϴ�");
				 }
					 */
			 Scanner scan = new Scanner(System.in);
			 System.out.println("���ϰ��� �ϴ� ������ �Է��Ͻÿ� : ");
			 int year = scan.nextInt();
			 boolean flag = false;
			 String str = "";
			 
			 if ( year % 4 == 0) 
			  if ((year % 100 != 0 )||( year % 400 == 0 )) 
					flag = true;
			 
			 str = ( flag == true) ? "����" : "���";
				 System.out.println(year + "�� ====>" +str );
					 
				 }
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
			
			
			
/*
			
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
			
			
			Scanner scan = new Scanner(System.in);
	System.out.println("���� -���� - ���� ������ ���ʴ�� �Է��Ͻÿ�. ");
	int com, eng, kor, avg;
	String str = null;
	
	com = scan.nextInt();
	eng = scan.nextInt();
	kor = scan.nextInt();
	avg = (com+eng+kor)/3;
	
	if((com<40)&&(eng<40)&&(kor<40)) str = "����";
	else if (avg>60) str = "�հ�";
	
	else{
		str="���հ�";
	}
	  System.out.printf("��� : %s ", str );
			
	*/		
			
		}


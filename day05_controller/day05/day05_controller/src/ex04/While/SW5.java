package ex04.While;

import java.util.Scanner;

public class SW5 {
public static void main(String[] args) {
//	����6]�̸� �� ���� 3�� (k,e,c) 0~100 ���� �Է¹޾Ƽ� ���� ��� ���ϴ� ���α׷� �ۼ�
	int total, k, e, c; //���������� do ~ while �ۿ���
    double avg;
    System.out.print("�̸��� �Է��� �ּ��� : ");
    String name = new Scanner(System.in).next();
    char op = ' ';
    
    do {
    	System.out.println("������ �Է��� �ּ��� \n\n ����: ");
    	k = new Scanner(System.in).nextInt();
    }while(k < 0 || k >  100 );
    	
    do {
    	System.out.println(" ���� : ");
    	e = new Scanner(System.in).nextInt();
    }while(e < 0 || e >  100 );
    	
    	do {
    		System.out.println(" ���� : ");
        	c = new Scanner(System.in).nextInt();
    	}while(c < 0 || c >  100 );
    	
//    	do {
//    		System.out.println("������ [+-*/] ");
//    		op = new Scanner(System.in).next().charAt(0);
//    	}while((op = +)&&
    
    
    	

    

   
    
    total = k+e+c;
    avg = ((double)k+e+c)/3.0;
	

	  System.out.println( name + " �� ������ " + total + "�̰�" + "����� " + avg + "�Դϴ�.");
}
}

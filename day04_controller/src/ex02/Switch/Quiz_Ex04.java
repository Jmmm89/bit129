package ex02.Switch;

import java.util.Scanner;

public class Quiz_Ex04 {
public static void main(String[] args) {
//	¦, Ȧ�� ���� switch~ case �� �����
	
	System.out.print("���ڸ� �Է��ϼ��� : ");
	int myNum = new Scanner(System.in).nextInt();
	
	switch(myNum % 2) {
	case 0 : 
		System.out.println(" ¦�� �Դϴ� ");
		break;
	
	case 1 : 
		System.out.println(" Ȧ�� �Դϴ� ");
		break;
		
		default :
			System.out.println(" �����Դϴ� ");
	
		}
	}
}


/*
 * System.out.println("integer data input : ");
		
		int su = new Scanner(System.in).nextInt();

		if (su % 2 == 0) {
			System.out.println("¦��");
			if( su > 0 ) {
				System.out.println("���");
			}else if ( su < 0 ) {
				System.out.println("����");
			} else {
				System.out.println("0");
			}

		} else {
			System.out.println("Ȧ��");
			if( su > 0 ) {
				System.out.println("���");
			}else if ( su < 0 ) {
				System.out.println("����");
			} else {
				System.out.println("0");
			}
		}
 */

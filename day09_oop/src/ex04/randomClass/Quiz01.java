package ex04.randomClass;

import java.util.Random;
import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {
	//���� ������ ���� 1~100 / 5�� ��ȸ�� ���� �Է� ������ �˸�+������� 
		// ��ȸ �����ϸ� ���� �˸� +�������
		// ����� �Է´��� ���ؼ� ũ�� up ������ down ���
	int [] arrcor = new int [1]; // 0(����) 1 2 3 4 5
	int [] arrscore = new int [5];
	int cor;
	int score;
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	cor = (rand.nextInt(100)+1);
	arrcor[0] = cor;
	for (int i = 0; i < arrscore.length; i++) {
		//�����Է� + ������
		System.out.println("���ڸ� �Է��ϼ��� : " );
		score = scan.nextInt();
		arrscore[i] = score;
		
		if( arrcor[0] > arrscore[i]) {
			System.out.println("up�Դϴ�");
		}
		else if(  arrcor[0] < arrscore[i] ) {
			System.out.println("down�Դϴ�");
		}
		else if( arrcor[0] == arrscore[i] ){ 
			System.out.println("�����Դϴ�. ������ " + arrcor[0] +" �Դϴ�. ");
		}
	}
		for (int j = 0; j < arrscore.length; j++) {
			if (arrcor[0] != arrscore[j])
			{System.out.println("�����Դϴ�. ������ " + arrcor[0] +" �Դϴ�. ");
			break;}
		}
			
	
	
	
}
}

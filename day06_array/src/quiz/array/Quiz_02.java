package quiz.array;

import java.util.Scanner;

public class Quiz_02 {
public static void main(String[] args) {
	//���� 2] 3���� �迭 ������ ������ �Է� �޾Ƽ� ���
	int [][][] arr = new int [2][2][3];
	
	
	System.out.println("========�迭�� �Է�=========");
	for (int i = 0 ; i < arr.length; i ++) {
		for (int j = 0; j < arr[i].length; j++) {
			for (int k = 0; k < arr[i][j].length; k++) {
				System.out.println("�迭 arr["+i+"]["+j+"]["+k+"] ������ �Է� : ");
				arr[i][j][k] = new Scanner(System.in).nextInt();
			}
		}
	}
	System.out.println("=========�迭�� ���===========");
	for (int i = 0 ; i < arr.length; i ++) {
		for (int j = 0; j < arr[i].length; j++) {
			for (int k = 0; k < arr[i][j].length; k++) {
				System.out.println("�迭 arr["+i+"]["+j+"]["+k+"]="+arr[i][j][k]);
			}
		}
	}
	
}
}

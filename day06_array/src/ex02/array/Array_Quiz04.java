package ex02.array;

import java.util.Scanner;

public class Array_Quiz04 {
public static void main(String[] args) {
	
	
	//������ ������ �Է� �޾Ƽ� ����ϴ� ���α׷� �ۼ�
	
	Scanner scan = new Scanner(System.in);
	
	int[][] arr = new int [2][3];
	
	
	System.out.println(" �迭 ������ �Է±� =================");
	for ( int i = 0; i < 3; i++) {
		for ( int j = 0; j < 4; j++) {
	System.out.println("�迭�� "+ (j) + "��°���� �Է��ϼ��� : ");
	arr[i][j] = scan.nextInt();
	}
}
	
}
}

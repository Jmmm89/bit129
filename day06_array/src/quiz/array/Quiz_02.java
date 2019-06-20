package quiz.array;

import java.util.Scanner;

public class Quiz_02 {
public static void main(String[] args) {
	//문제 2] 3차원 배열 임의의 데이터 입력 받아서 출력
	int [][][] arr = new int [2][2][3];
	
	
	System.out.println("========배열값 입력=========");
	for (int i = 0 ; i < arr.length; i ++) {
		for (int j = 0; j < arr[i].length; j++) {
			for (int k = 0; k < arr[i][j].length; k++) {
				System.out.println("배열 arr["+i+"]["+j+"]["+k+"] 데이터 입력 : ");
				arr[i][j][k] = new Scanner(System.in).nextInt();
			}
		}
	}
	System.out.println("=========배열값 출력===========");
	for (int i = 0 ; i < arr.length; i ++) {
		for (int j = 0; j < arr[i].length; j++) {
			for (int k = 0; k < arr[i][j].length; k++) {
				System.out.println("배열 arr["+i+"]["+j+"]["+k+"]="+arr[i][j][k]);
			}
		}
	}
	
}
}

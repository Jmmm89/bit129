package ex02.array;

import java.util.Scanner;

public class Array_Quiz04 {
public static void main(String[] args) {
	
	
	//임의의 데이터 입력 받아서 출력하는 프로그램 작성
	
	Scanner scan = new Scanner(System.in);
	
	int[][] arr = new int [2][3];
	
	
	System.out.println(" 배열 데이터 입력기 =================");
	for ( int i = 0; i < 3; i++) {
		for ( int j = 0; j < 4; j++) {
	System.out.println("배열의 "+ (j) + "번째값을 입력하세요 : ");
	arr[i][j] = scan.nextInt();
	}
}
	
}
}

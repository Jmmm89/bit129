package day06_OT;

import java.util.Scanner;

public class OT_01 {
public static void main(String[] args) {
	int a = 0;
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("======= �迭 ������ �Է��Ͻÿ� ======");
	a = scan.nextInt();
	int[] arr = new int [a];
	
	for ( int i = 0; i < arr.length; i++) {
		arr[i] = (i+3);
		
	}
	System.out.println("====== arr �迭�� ������ =======");
	for ( int j = 0; j < arr.length; j++) {
		System.out.println((j+1)+"��°�� �� "+ "arr["+(j)+"] : "+arr[j]);
	}
	
}
}

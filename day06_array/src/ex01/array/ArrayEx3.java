package ex01.array;

import java.util.Scanner;

public class ArrayEx3 {
public static void main(String[] args) {
	
	int [] arr = new int[5];
	
	Scanner sc = new Scanner(System.in);
	System.out.print(" ���� ������ �Է� : ");
	int x = sc.nextInt();
	
	System.out.println(" �迭 ������ �Է� : ");
	arr[0] = sc.nextInt();
	arr[1] = sc.nextInt();
	arr[2] = sc.nextInt();
	arr[3] = sc.nextInt();
	arr[4] = sc.nextInt();
	
	System.out.println("=============================");
	for (int i = 0; i < arr.length; i ++) {
		System.out.println((i+1)+"��° ������ = ");
		arr[i] = sc.nextInt();
	}
	
	
	System.out.println( " ���� ������ : " + x );
	System.out.println( " for �� �迭 ��� ");
	
	for (int i = 0; i < arr.length ; i++ ) {
		System.out.println("a[" + i + "] = " + arr[i]);
	}
	
	System.out.println(" =================================");
	for (int i = 0; i < arr.length ; i++ ) {
		System.out.println(i+"+ i ��° ������ " + arr[i]);
	}
}
}

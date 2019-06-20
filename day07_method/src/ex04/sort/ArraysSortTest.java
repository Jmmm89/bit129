package ex04.sort;

import java.util.Arrays;

public class ArraysSortTest {
public static void main(String[] args) {
	
	int [] a = {7, 1, 5, 3, 2};
	
	System.out.println(" 정렬 전");
	for (int i = 0; i < a.length; i++) {
		System.out.print("a[" + i + "] = " + a[i] + "\t");
	}
	
	System.out.println("\n 오름차순 정렬됨 ");
	Arrays.sort(a);
	
	for (int i = 0; i < a.length; i++) {
		System.out.print("a[" + i + "] = " + a[i] + "\t");
	}
	
	System.out.println("\n 내림차순 정렬됨 ");
	// i = a.length-1는 data 개수는 5지만, 배열의 인덱스는
	// 0 부터 시작하기 때문에 4로 시작해야함
	for (int i = a.length-1; i >= 0; i--) {
		System.out.print("a[" + i + "] = " + a[i] + "\t");
	}
}
}

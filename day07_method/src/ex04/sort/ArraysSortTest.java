package ex04.sort;

import java.util.Arrays;

public class ArraysSortTest {
public static void main(String[] args) {
	
	int [] a = {7, 1, 5, 3, 2};
	
	System.out.println(" ���� ��");
	for (int i = 0; i < a.length; i++) {
		System.out.print("a[" + i + "] = " + a[i] + "\t");
	}
	
	System.out.println("\n �������� ���ĵ� ");
	Arrays.sort(a);
	
	for (int i = 0; i < a.length; i++) {
		System.out.print("a[" + i + "] = " + a[i] + "\t");
	}
	
	System.out.println("\n �������� ���ĵ� ");
	// i = a.length-1�� data ������ 5����, �迭�� �ε�����
	// 0 ���� �����ϱ� ������ 4�� �����ؾ���
	for (int i = a.length-1; i >= 0; i--) {
		System.out.print("a[" + i + "] = " + a[i] + "\t");
	}
}
}

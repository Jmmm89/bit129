package ex01.next;

public class Sort_01 {
	public static void main(String[] args) {

		/*
		 * Sort(정렬) 1. 선택 (selection) 소트 ; 기준있다. a[4] 7 3 5 2 8 a[0]이 기준 7
		 * 
		 */

		int[] a = { 7, 3, 5, 2, 8 };

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = " + a[i] + "\t");
		}

		System.out.println("\n=======================");
		System.out.println("=======================");
		for (int i = 0; i < a.length; i++) {
			// i+1
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
	}
}

package ex01.array;

public class Array_Quiz01 {
public static void main(String[] args) {
	int total=0;
	int[] arr = { 7, 5, 3, 8, 2};
	
	for ( int x = 0; x < arr.length; x++) {
		System.out.println(arr[x]);
		total += arr[x];
	
		
	}
	System.out.println("=======total °ª========");
	System.out.println(total);
}
}

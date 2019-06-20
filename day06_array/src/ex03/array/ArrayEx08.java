package ex03.array;

import java.util.Random;

public class ArrayEx08 {
public static void main(String[] args) {
	int[][][] arr = new int [2][2][3];
	int x = 0 ;
	
	System.out.println("면의 크기 = " + arr.length);
	System.out.println("행의 크기 = " + arr[0].length);
	System.out.println("열의 크기 = " + arr[0][1].length);
//	System.out.println("열의 크기 = " + arr[0][0].length);
	
	for ( int i = 0 ; i < arr.length; i ++ ) {
		for ( int j = 0 ; j < arr[i].length; j ++ ) {
			for ( int k = 0; k < arr[i][j].length; k ++ ) {
		//		arr[i][j][k] = ++x;
//				arr[i][j][k] = x += 10;
				//arr[i][j][k] = (int)(Math.random()*100);
				arr[i][j][k] = new Random().nextInt(45) + 1; // 1~ 45 사이 값이 추출됨
			}
		
		}
		
	}
	for ( int i = 0 ; i < arr.length; i ++ ) {
		for ( int j = 0 ; j < arr[i].length; j ++ ) {
			for ( int k = 0; k < arr[i][j].length; k ++ ) {
				System.out.println(arr[i][j][k]+"\t");
				
			}
			System.out.println();
		}
		System.out.println();
	}
	

}
}

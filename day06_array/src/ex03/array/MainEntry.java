package ex03.array;

public class MainEntry {
public static void main(String[] args) {
	
	int [] a = new int [30];
	int [][] a2 = new int [2][3];
	int [][] a3 = new int [][] {{1,2,3},{4,5,6}};
	int [][] a4 = {{1,2,3},{4,5,6}}; //초기화
	//int [][] a5 = new int [][] {1,2,3,4,5,6}; // error
	//int [][] a6 = new int [2][] {{1,2,3},{4,5,6}}; error
	int[][] a7 = {{0},{0}};
	
	int[][][] a8 = new int [2][32][3]; //[면] [행] [열] 
	int[][] a9 = new int [2][3]; // [행][열]
	a9[0][0] = 100;
	a9[0][1] = 200;
	a9[0][2] = 300;
	
	a9[1][0] = 400;
	a9[1][1] = 500;
	a9[1][2] = 600;
	
	// int [][] a9 = {{100,200,300},{400,500,600}};
	
	System.out.println(a9[0][1]);
	System.out.println("1차원의 배열 전체 길이 : " + a.length);
	System.out.println("2차원배열의 a9[0] 요소 길이 : " + a9[0].length);
	System.out.println("2차원배열의 a9[1] 요소 길이 : " + a9[1].length);
	System.out.println("---------------------------------------------");
	
	for (int i = 0; i < a9.length; i++) {
		for (int j = 0; j < a9.length; j++) {
			System.out.println("a9[" + i +"][" + j +"] = " + a9[i][j]);
			
		}
		
	}
	
	
	// 초기화 되어 있지 않을때는, 행 열 크기를 생략 할 수 없다.
}
}

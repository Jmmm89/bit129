package ex02.array;



public class Array_Quiz05 {
public static void main(String[] args) {
	
	
	//임의의 데이터 입력 받아서 출력하는 프로그램 작성
	
	
	int [][] arr = {{1,2,10,5},{9,7,3,20},{0,0,0,0}};
    int sum = 0;
	// 3 , 4 > 2 3
    
    //System.out.println(arr[4].length);
    
    System.out.println("3행 4열 값 ====");
	for ( int i = 0; i < arr[0].length ; i++ ) {
	
		 arr[2][i] = arr[0][i] + arr[1][i];
		 System.out.print("arr[2]["+i+"] : " );
		 System.out.println(arr[2][i]);
	  
	}
	System.out.println("\n\n 각 배열 값 : ");
	for ( int i = 0; i < arr.length; i++ ) {
		for ( int j = 0; j < arr[0].length; j++) {
			
				
			System.out.print("arr["+i+"]"+"["+j+"]"+ ": " +arr[i][j] + "\t");
			
		}
	}
	
	
}
}

package ex02.array;



public class Array_Quiz05 {
public static void main(String[] args) {
	
	
	//������ ������ �Է� �޾Ƽ� ����ϴ� ���α׷� �ۼ�
	
	
	int [][] arr = {{1,2,10,5},{9,7,3,20},{0,0,0,0}};
    int sum = 0;
	// 3 , 4 > 2 3
    
    //System.out.println(arr[4].length);
    
    System.out.println("3�� 4�� �� ====");
	for ( int i = 0; i < arr[0].length ; i++ ) {
	
		 arr[2][i] = arr[0][i] + arr[1][i];
		 System.out.print("arr[2]["+i+"] : " );
		 System.out.println(arr[2][i]);
	  
	}
	System.out.println("\n\n �� �迭 �� : ");
	for ( int i = 0; i < arr.length; i++ ) {
		for ( int j = 0; j < arr[0].length; j++) {
			
				
			System.out.print("arr["+i+"]"+"["+j+"]"+ ": " +arr[i][j] + "\t");
			
		}
	}
	
	
}
}

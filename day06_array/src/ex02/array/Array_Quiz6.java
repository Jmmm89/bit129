package ex02.array;



public class Array_Quiz6 {
public static void main(String[] args) {
	
	
	//������ ������ �Է� �޾Ƽ� ����ϴ� ���α׷� �ۼ�
	
	
	int [][] arr = {{10,20,0},{1,2,0},{5,7,0}};
    
	// 3 , 4 > 2 3
    
    //System.out.println(arr[4].length);
    
    System.out.println("���� 3�� �� ====");
	for ( int i = 0; i < arr.length ; i++ ) {
	
		 arr[i][2] = arr[i][0] * arr[i][1];
		 System.out.print("arr["+i+"][2] : " );
		 System.out.println(arr[i][2]);
	  
	}
	
	for ( int i = 0; i < arr.length ; i ++ ) {
		for ( int j = 0; j < arr[0].length ; j++) {
             System.out.println();			
	}
	
	}
}
}
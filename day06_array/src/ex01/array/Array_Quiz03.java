package ex01.array;

public class Array_Quiz03 {
public static void main(String[] args) {
	//���� 2 ] Ư������ ������ ����� ���ϴ� ���α׷� �ۼ�
	//   
	
	int count = 0;

	int [] a = {7 , 5, 7, 8, 2, 7, 3, 7, 7, 90};
	
	
    System.out.println("====7�� ���� ���ϴ� ���α׷�====");
    
    
    for ( int i = 0; i< a.length; i++) {
    	if (a[i] == 7) {
    		count += 1;
    	}
    }
            	System.out.println("7�� ���� : " +count);
    	
    
    
//	 avg = (double)sum/30.0;
//	 System.out.println(" 4���� ������ : " + avg);

}
}

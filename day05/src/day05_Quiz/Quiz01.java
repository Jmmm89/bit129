package day05_Quiz;

public class Quiz01 {
public static void main(String[] args) {
	
//����1 1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5) = ?
//����2] (-1) + 2 + (-3) + 4 + (-5) + 6 + (-7) + 8 + (-9) + 10 = ?
//����3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = ?
//
//	for (int a = 1; a <= 5 ; a++) {
//		for (int b = 1; a<= 5; b++) {
//			System.out.println(a+b);
//		}
//			
//	}
	System.out.println("==========���� 1 ===========");
	System.out.print("1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5) = ");
	int sum = 0;

	for( int a=1 ; a<=5; a++){ //��ü [���]
			 for(int b=1 ; b<=a ; b++)	 { //[1���] ����Ƚ��
		   sum += b;
				
		}
		
		}
	  System.out.print(sum);
}
}
	
	
	
	
		
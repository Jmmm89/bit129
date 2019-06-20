package ex01.array;

public class Array_Quiz03 {
public static void main(String[] args) {
	//문제 2 ] 특정달의 강수량 평균을 구하는 프로그램 작성
	//   
	
	int count = 0;

	int [] a = {7 , 5, 7, 8, 2, 7, 3, 7, 7, 90};
	
	
    System.out.println("====7의 갯수 구하는 프로그램====");
    
    
    for ( int i = 0; i< a.length; i++) {
    	if (a[i] == 7) {
    		count += 1;
    	}
    }
            	System.out.println("7의 갯수 : " +count);
    	
    
    
//	 avg = (double)sum/30.0;
//	 System.out.println(" 4월의 강수량 : " + avg);

}
}

package day07.Foreach;

public class ForEach_01 {
public static void main(String[] args) {
	// for ( 초기값 ; 조건 ; 증감식 )
	// {반복 실행문 ; }
	
	// for ( 자료형 변수명 : 배열명 or 컬렉션명 )
	// {반복 실행문 ; }    
	
	
	 int[] a = {1,2,5,6,7,90,100};
	 System.out.println("============For===========");
	 for ( int i = 0; i < a.length; i++)
	 { System.out.print(a[i] + " ");
	      if(i == 3)
	    	  break;
	 }
	 System.out.println();
	 System.out.println("=========Each for=========");
	 
	 for ( int item : a ) {
		 System.out.print(item + " ");
	 }
	 	 System.out.println();
		 System.out.println("========내림차순 출력========");
		 for (int i = a.length-1; i >= 0; i--) {
			 System.out.print(a[i]+" ");
		 }
}
}

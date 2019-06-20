package ex01.array;

public class ArrayEx2 {
public static void main(String[] args) {
	
 /*int [] arr = new int[5];
   인트 배열 변수 = 뉴 인트[갯수];
  arr[0] = 1;
  arr[1] = 2;
  arr[2] = 3;
  arr[3] = 4;
  arr[4] = 5;
  */
	
   int[] arr = {1,2,3,4,5};
	
  System.out.println("arr[0] = " + arr[0]);
  System.out.println("arr[0] = " + arr[1]);
  System.out.println("arr[0] = " + arr[2]);
  System.out.println("arr[0] = " + arr[3]);
  System.out.println("arr[0] = " + arr[4]);
  
  System.out.println("\n\n ========== for 문 ===========");
  
  
  
  for(int i = 0; i < arr.length ; i++) {
	  System.out.println("arr[" + i + "] = " + arr[i]);
	  
  }
  
  
	
	
	
	
	
	
	
	
}
}

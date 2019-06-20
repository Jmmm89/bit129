package ex03.input;
//import java.lang.*; 기본입력
//import java.util. *; // 유틸 패키지 전부다
import java.util.Scanner; //  유틸 패키지 안에 스캐너 클래스 only
public class InputTest {
  public static void main(String[] args) {
	
	   // 표준입력 : System.in
	  Scanner scan = new Scanner(System.in);
	  System.out.print("정수 데이터 입력 요망 : ");
	  int su = scan.nextInt();
	  double x = scan.nextDouble();
	  //			nextFloat()
	  //			nextDouble()
	  //next() vs 	nextLine() <--- String input method
	  System.out.println("\n\n입력 받은 수 : " + su);
	  System.out.printf("입력 받은 수 : %f"+ x);
	  
	  // 자바는 자동으로 임포트 해주는 패키지가 있다. - java.lang
	  
}
}

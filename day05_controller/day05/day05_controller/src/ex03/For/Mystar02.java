package ex03.For;

public class Mystar02 {
public static void main(String[] args) {
	
	
	for(int i=1; i<=5; i++) {//전체행수
		for(int k=5; k>=i; k--) {//k=5 k>=6-i; k--) {//[1행당] 실행횟수
			//5>1 * 4>1 * 3>1 * 2>1 * 1>=1 *
			System.out.print("*");
			
	}
  System.out.println();	
	}
	
}
}

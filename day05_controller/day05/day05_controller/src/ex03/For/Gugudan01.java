package ex03.For;

public class Gugudan01 {
public static void main(String[] args) {
	
	
	for(int i=1; i<=9; i++) { //전체 [행수]
		for(int k=2; k<=9; k++) { //[1행당] 실행횟수
			System.out.print(k+" * "+i+" = "+i*k+"\t");
	//		System.out.printf("%2d * %2d = %2d \t",k ,i,(k*i));
	}
  System.out.println(" ");	
	}
	
}
}

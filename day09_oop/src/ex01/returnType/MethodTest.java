package ex01.returnType;

public class MethodTest {

	public static int methodEx(double d1, double d2 ) {
		
		double hap = d1+d2;
		
		//함수타입을 우선적으로 맞춰줘야한다
		return (int)hap; // int 메소드는 int로 리턴/ 리턴타입 != 함수타입 에러
		
		
	}
	
	public static void main(String[] args) {
		
		int result = methodEx(1.2, 3.4);
	}
	
	
}

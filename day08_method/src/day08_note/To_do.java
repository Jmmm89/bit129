package day08_note;

public class To_do {
	
	
	// 1. 매개변수X 리턴타입X

	public static void display() { // 함수 정의부
		System.out.println("안녕하세요");
		System.out.println("스파이더맨");
	}
	
public static void plus ( int x, int y, String msg ) {
	
	System.out.println("hap = " + (x+y));
	int sum = x + y;
	System.out.println("sum = " + sum);
	System.out.println(msg);
}
	public static void total ( int kor, int eng, int com) {
		
		int total = kor+eng+com;
		System.out.println(total);
		
	
}
  
	
	
	
	
public static void main(String[] args) {
	plus(100, 5, "하이");
	
	System.out.println("main start~~~~");
	display(); // 함수호출
	
	System.out.println("main end!!!");
	
	
	
}

}
package ex01_basic;

public class DataType {
	
	static int Num; // 정수형 : 0, 실수형 : 0.0, 문자열: NULL
	static String str;
	
	
	public static void main(String[] args) {
		int su = 30; //지역변수는 초기화필수
		System.out.println(su);
	
	  su= 900;
	  System.out.println(su);
	  System.out.println(Num);
	  System.out.println(str);
	  
	}//main end
} // class end
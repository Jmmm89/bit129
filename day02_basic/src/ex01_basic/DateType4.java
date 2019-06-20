package ex01_basic;

public class DateType4 {

	public static void main(String[] args) {
	     int su = 10;
	     
	     System.out.println("10진수 : " + su); // %d(십진수), %o(8진수), %x(16진수), %X
	     System.out.printf("10진수 : %d\n" , su);
	     System.out.printf("8진수 : %o\n" , su);
	     System.out.printf("16진수 : %x %X" , su, 10);
	     System.out.println();
	     System.out.printf("%d %x %o %X \n" , 10, 10, 10, 10);
	     
	     //0숫자 --> 8진수, 0x숫자 --> 16진수
	     System.out.printf("%d \n", 012); // 012(8진수) --> 10진수
	     System.out.printf("%d \n" , 0xA); // 0xA(16진수) --> 10진수 출력
	     
	     
	     System.out.println("======================");
	     
	     double f = 12.34;
	     System.out.println(f);
	     float ff = 5.6f;   // 뒤에서 부터 읽기 때문에 더블로 인식한다 명시적 형변환을 하지 않으면 오류
	     System.out.println(ff);
		
	}

}

//*
package ex01_basic;

public class DateType3 {
	// 모든 자료형은 자신의 범위(크기)를 안벗어난다.
	 public static void main(String[] args) {
		 short sh = 32767; // -32768 ~ 32,767
		 int num = 50000; // -21억 ~ 21억
		 
		 System.out.println(sh + " : " + num);
		 
		 num = -32769;
		 sh = (short)num; //명시적 형변환
		 System.out.println(sh + " : " + num);
	}
		 
}
//*/

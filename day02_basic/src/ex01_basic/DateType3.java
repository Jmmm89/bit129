//*
package ex01_basic;

public class DateType3 {
	// ��� �ڷ����� �ڽ��� ����(ũ��)�� �ȹ����.
	 public static void main(String[] args) {
		 short sh = 32767; // -32768 ~ 32,767
		 int num = 50000; // -21�� ~ 21��
		 
		 System.out.println(sh + " : " + num);
		 
		 num = -32769;
		 sh = (short)num; //����� ����ȯ
		 System.out.println(sh + " : " + num);
	}
		 
}
//*/

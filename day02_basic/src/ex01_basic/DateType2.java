//*
package ex01_basic;

public class DateType2 {

	public static void main(String[]args) {
		short sh = 32767; // -32768 ~ 32767 : 2byte
		int num = 32769; // -21�� ~ 21�� : 4byte
		//���� �ڷ����� ū�ڷ�����... �ڵ�����ȯ(����������ȯ) �ȴ�.
		num = sh;  // int(4byte) <-= short(2byte)
		System.out.println("sh = " + sh);
		System.out.println("num = " + num);
		
		num = 32769;
		//ū�ڷ����� ���� �ڷ����� �������� ���������ȯ �ؾ��Ѵ�.
		//������ �ս� �߻�
		sh = (short)num; // short(2byte) <-= int(4byte)
		System.out.println("sh = " +sh);
		System.out.println("num = " +num);
	} 
}


/*

package ex01_basic;

public class DateType2 {

	public static void main(String[]args) {
		String str="A"; // ���ڿ�, " ", 2byte A+null
		char ch= 'A';  //  ����, ' ' , 1byte
		char ch2 = 67; 
		char ch3 = 'b'; // ASCII 98
		int su = 20; 
		String aa = "happy"; 
		double d = 12.34;
		
		System.out.println(ch); // A
		System.out.println(str); // A
		System.out.println((int)ch); //ASCII 98
		System.out.println(ch2 + ch3); // 165
		System.out.println("aa = " + aa);
		System.out.println("�Ǽ��� ������ : "+d);
		System.out.println("--------------------");
	
		for(int i=65; i<=90; i++) {
			System.out.print((char)i + " "); // \t : tap key
		}
			System.out.println("\n\n-----------------------");
			
			for(int i = 'a'; i<= 'z'; i++) {
				System.out.print((char)i + " ");
				
				
				System.out.println("\n\n\nboolean type");
				boolean flag =true;
				//int b = flag;
				System.out.println(flag);
			}//end for
		}//end for
	}//end main

//end class
//*/
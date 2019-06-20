//*
package ex01_basic;

public class DateType2 {

	public static void main(String[]args) {
		short sh = 32767; // -32768 ~ 32767 : 2byte
		int num = 32769; // -21억 ~ 21억 : 4byte
		//작은 자료형이 큰자료형에... 자동형변환(묵시적형변환) 된다.
		num = sh;  // int(4byte) <-= short(2byte)
		System.out.println("sh = " + sh);
		System.out.println("num = " + num);
		
		num = 32769;
		//큰자료형을 작은 자료형에 넣으려면 명시적형변환 해야한다.
		//데이터 손실 발생
		sh = (short)num; // short(2byte) <-= int(4byte)
		System.out.println("sh = " +sh);
		System.out.println("num = " +num);
	} 
}


/*

package ex01_basic;

public class DateType2 {

	public static void main(String[]args) {
		String str="A"; // 문자열, " ", 2byte A+null
		char ch= 'A';  //  문자, ' ' , 1byte
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
		System.out.println("실수형 데이터 : "+d);
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
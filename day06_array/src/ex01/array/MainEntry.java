package ex01.array;

public class MainEntry {
public static void main(String[] args) {
	
	//1.
	
	 char[] ch ; // 배열선언
	 ch = new char[4];
//	 ch[0] = 'J'; ch[1] = 'A'; ch[2] = 'V'; ch[3] = 'A';
	 
	 //2.
	 char[] ch2 = new char[4]; // 배열선언 및 생성
	 ch2[0] = 'J';
	 ch2[1] = 'A';
	 ch2[2] = 'V';
	 ch2[3] = 'A';
	 
	 //3.
	 char[] ch3 = {'J', 'A' , 'V' , 'A'};
	 
	 
	 //배열의 길이(크기)
	 System.out.println("배열의 길이(크기) : " + ch2.length);
	 
	 //배열의 내용 출력
	System.out.println( "ch[2]" + ch[2]);
	System.out.println("\n=================");
	
	for (int i=0 ; i < 4; i++) {
		System.out.println("ch2[" + i + "] = " + ch2[i]);
	}
	
	
	// 비교값에 렝스를 넣어서 출력
	System.out.println("\n=================");
	for (int i=0 ; i < ch2.length; i++) {
		System.out.println("ch2[" + i + "] = " + ch2[i]);
	
	}
	System.out.println("\n=================");
	for (int i=0 ; i < ch3.length; i++) {
		System.out.println("ch3[" + i + "] = " + ch3[i]);
	}
}
}

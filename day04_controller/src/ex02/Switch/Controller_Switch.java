package ex02.Switch;

import java.util.Scanner;

public class Controller_Switch {
public static void main(String[] args) {
	System.out.print("point ? ");
	
	int point = new Scanner(System.in).nextInt();
	
	switch(point) {//문자형 정수형 (long 제외) 실수형x
	//jdk 6.0 이하에서는 문자열 입력 x
	case 1 : 
		System.out.println("포인트 점수 1점입니다");
		break;
		
	case 2 : 
		System.out.println("포인트 점수 2점입니다");
		break;
		
	case 3 : 
		System.out.println("포인트 점수 3점입니다");
		break;
	
	default :
		System.out.println("1~3까지만 입력 하세요");
}//switch end
}
}

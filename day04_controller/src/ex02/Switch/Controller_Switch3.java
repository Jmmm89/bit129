package ex02.Switch;

import java.util.Scanner;

public class Controller_Switch3 {
public static void main(String[] args) {
	
	System.out.println("당신의 포인트 = ");
	Scanner sc = new Scanner(System.in);
	int point = sc.nextInt();
	
	switch (point) {
	case 1 : System.out.print("집 "); break;
	case 2 : System.out.print("피아노 "); break;
	case 3 : System.out.print("우산 "); break;
	//브레이크가 없으면 다음값까지 출력
	
	}
	System.out.println("상품에 당첨 되셨습니다. 축하합니다. ");
}
}


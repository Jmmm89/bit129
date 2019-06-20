package ex02.Switch;

import java.util.Scanner;

public class Controller_Switch2 {
public static void main(String[] args) {
	
	System.out.println("도시를 선택하세요 (s,d,b,j) = ");
	Scanner sc = new Scanner(System.in);
	//String str = sc.next();
	//char ch = str.charAt(0);
	char ch = sc.next().charAt(0);//똑같다
	
	switch (ch) {
	case 's' : System.out.print("서울"); break;
	case 'd' : System.out.print("대구"); break;
	case 'b' : System.out.print("부산"); break;
	case 'j' : System.out.print("제주"); break;
	
	default : 
		System.out.print("잘못 눌렀습니다. s,d,b,j 중에 입력하세요"); 
		System.exit(0);break;
		
	}
	System.out.println("를 (을) 선택하셨습니다. ");
}
}

/*
 * 	System.out.println("도시를 선택하세요 (s,d,b,j) = ");
	Scanner sc = new Scanner(System.in);
	String ch = sc.next();
	
	switch (ch) {
	case "s" : System.out.print("서울"); break;
	case "d" : System.out.print("대구"); break;
	case "b" : System.out.print("부산"); break;
	case "j" : System.out.print("제주"); break;
	
	default : 
		System.out.print("잘못 눌렀습니다. s,d,b,j 중에 입력하세요"); 
		System.exit(0);break;
		
	}
	System.out.println("를 (을) 선택하셨습니다. ");
 */
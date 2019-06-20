package ex01.next;

import java.util.Scanner;

public class MainEntry {
public static void main(String[] args) {
	//next() vs nextLine() 메모리?
	//next()로 입력을 받으면 enter도 buffer에 남음
	Scanner sc = new Scanner(System.in);
	System.out.println("이름 입력기");
	System.out.println("================");
	String name = sc.next();
	String something = sc.next();//공백처리
	String s   = sc.next();
	
	System.out.println( name + something + s);
}
}

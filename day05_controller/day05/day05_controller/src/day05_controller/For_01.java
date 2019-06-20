package day05.day05_controller.src.day05_controller;

import java.util.Scanner;

//구구단 출력

public class For_01 {
public static void main(String[] args) {
	
	 
	
	 System.out.print("구구단으로 출력할 단수를 입력하세요 : ");
	 Scanner scan = new Scanner(System.in);
	 int dan = scan.nextInt();
	 
	 
	 for (int gu = 1; gu<=10; gu++) {
		 
		 System.out.println(dan+"*"+gu+"="+dan*gu);
	 }
	 
 	
}
}

package ex01.If;

import java.util.Scanner;

public class Controller_If2 {
	public static void main(String[] args) {
	System.out.println("integer data input : ");
		
		int su = new Scanner(System.in).nextInt();

		if (su % 2 == 0) {
			System.out.println("礎熱");
			if( su > 0 ) {
				System.out.println("曄熱");
			}else if ( su < 0 ) {
				System.out.println("擠熱");
			} else {
				System.out.println("0");
			}

		} else {
			System.out.println("�汝�");
			if( su > 0 ) {
				System.out.println("曄熱");
			}else if ( su < 0 ) {
				System.out.println("擠熱");
			} else {
				System.out.println("0");
			}
		}
	}
}

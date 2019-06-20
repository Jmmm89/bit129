package ex01.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("사과=10|초코렛=3|샴페인=1", "=|", true);
		
		
		while( token.hasMoreTokens()) { // 다음 요소가 있느냐
			//System.out.println(token.nextToken());
			
			String str = token.nextToken();
			if(str.equals("="))System.out.println("\t");
			else if ( str.equals("|"))System.out.println("\n");
			else System.out.println(str);
		}
	}
	
}






/*
package ex01.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("박정희/노태우/전두환/김영삼", "/");//디폴트는 스페이스 설정값은 큰따옴표안에설정
		//StringTokenizer token = new StringTokenizer("박정희 노태우 전두환 김영삼");
		
		while( token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
	
}
*/
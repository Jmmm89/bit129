package ex05_break_continue;

public class MultiBreak2 {
public static void main(String[] args) {

	boolean flag = true;
	
	first : {
	second : {
	third : {
	
	       int k = 100;
	       System.out.println("Before the break");
	       
	       if ( flag ) break third; // 브레이크 다음에 식별자를 입력
	       System.out.println("This won't execute ");
	
}//third end
	System.out.println("ㅍㅇㅌ");
}//second end
	System.out.println("This is after second block ");
}//first end
	System.out.println(" ㅍㅇㅌ2 ");
	
	// 식별자 : {
	// 식별자 : {
	
	
}
}

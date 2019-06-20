package day05_Quiz;

public class Quiz02 {
public static void main(String[] args) {
	
	
	System.out.println("==========°úÁ¦ 2 ===========");
	System.out.println("(-1) + 2 + (-3) + 4 + (-5) + 6 + (-7) + 8 + (-9) + 10 = ?");
	int total = 0;
	int minar = 1;
	
	for (int i= -1; i>=-9; i-=2) {
	
		minar= minar*i;
		
	
	
	}
	System.out.println(minar);
}
}

package ex05_break_continue;

public class MultiBreak {
public static void main(String[] args) {
	// ��Ƽ ��Ƽ���� ����
//	for(int i = 1; i < 11; i++) {
//		if ( i == 3 ) break;
//		System.out.println(i);
//	}

	for(int i = 1; i < 11; i++) {
		if ( i == 3 ) continue;
		System.out.println(i);
	}
	
	
	for(int i = 1; i < 101; i++) {
		if ( i % 2 != 0 ) continue;
		System.out.println(i+ "\t");
		
		if( i % 10 == 0) System.out.println();
	}


}
}

package day08_note;

public class Method_T {
	public static char disp(int jumsu) {
		char grade =' ';
		if( jumsu >= 90 ) 		grade = 'A';		
		else if( jumsu >= 80 )   	grade = 'B';
		else if(  jumsu >= 70 ) 	grade = 'C';
		else if( jumsu >= 60 ) 	grade = 'D';		
		else 	grade = 'F';
		
		return grade;
	} // disp() end
	
	public static void main(String[] args) {
		System.out.println("grade = " + disp(55) + "����");
		char ch = disp(99);
		System.out.println("grade = " + ch + "����");
		
		System.out.println("-----------------");
		sub(10, 20);
		System.out.println("=============");
		view("*", 10);
		view("A", 15);
	} // main end
	
	
	public static void sub(int x, int y) {
//		if( x > y )
//			System.out.println(x + " - " + y +" = " + (x - y));
//		else 
//			System.out.println(y + " - " + x +" = " + (y - x));
//		
		int result = 0;
		result = ( x < y ) ? (y - x) : (x - y);
		System.out.println(result);
		
	} //sub() end
	
	public static void view(String str, int n) {
		for(int i=1; i <= n; i++) {
			System.out.print(str + " ");
		}
		System.out.println();
	}// view() end
	
	
}

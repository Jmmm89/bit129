package day08_note;

public class To_do2 {
	
	public static int show() {
		return 100;
	}
	
	
	
	
public static void main(String[] args) {

	
	System.out.println("main start");
	int result = show();
	System.out.println(result);
	System.out.println("show method call result : " + show());
	String str = name ( 10, "doyeon ");
	System.out.println(str);
}


	public static String name ( int x, String irum) {
		System.out.println( " x = " +x );
		return irum;
	
}
}

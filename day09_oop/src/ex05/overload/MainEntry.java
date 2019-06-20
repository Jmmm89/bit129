package ex05.overload;

public class MainEntry {

	public static void main(String[] args) {
		
		
		
		plus ( 1.2 , 3.45);
		plus ( "kbs" , "mbc");
		plus ( 100, 33.567);
		plus ((float)3.3);
		System.out.println("3.5ÀÇÁ¦°ö : " + zegob(3.5));
		System.out.println("3+3 = " + add(3,3));
	}//main end
	
	   
	
	
	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}




	private static double zegob(double d) {
		// TODO Auto-generated method stub
		return d*d;
	}




	private static void plus(float f) {
		// TODO Auto-generated method stub
		
	}




	private static void plus(String x, String y) {
		// TODO Auto-generated method stub
		System.out.println(x + y);
	}




	private static void plus(double x, double y) {
		// TODO Auto-generated method stub
		System.out.println(x + y);
	}

	private static void plus(int x, double y) {
		// TODO Auto-generated method stub
		System.out.println(x + y);
	}



		
	}


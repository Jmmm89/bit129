package day08_note;

public class To_do5 {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void loopline ( ) {
		 
		for ( int i = 1; i <= 7; i++) {
			System.out.println("------------");
			
		}
		
	}
	
	public static void loopline (int x) {
		 
		for ( int i = 1; i <= x; i++) {
			System.out.println("************");
			
		}
		
	}
	
	public static void loopline (int x, int y) {
		int temp; 
		if ( x>y ) 
		{temp = x; x=y;	y=temp;}
		
		
		
		for ( int i =x; i <= y; i++) {
			System.out.println("//////////////");
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
	
		loopline(2,1);
	
	

	
	}
}







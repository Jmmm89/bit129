package ex06.argumentVariable;


public class MainEntry {
	
public static void plus(int ...x) {
	int y =0;
	for (int i = 0; i < x.length; i++) {
		
		 y+=x[i];
		
	}
	System.out.print(y);
}
	public static void plus(String ...y) {
		String sum = "";
		for (int i = 0; i < y.length; i++) {
			sum += y[i];
			
		}
		System.out.println("\n" + sum);
	}
	  public static void main(String[] args) {
		
		  plus(1);
		  System.out.println();
		  plus(1,2,3);
		  System.out.println();
		  plus(1,2,3,4,5,6,7,8,9,10);
		  plus("a","b","c","d","e","f","g");
		  
		  
	}

	
}

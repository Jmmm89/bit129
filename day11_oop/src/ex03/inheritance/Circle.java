package ex03.inheritance;

public class Circle extends Point {
	protected int r;
	

	
	
	public Circle() {
		super();
		System.out.println("circle");
		// TODO Auto-generated constructor stub
	}


	public Circle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}


	public Circle( int r) {
		//super(x,y);//상속한 변수는 super 메소드사용
		this.x = x;
		this.y = y;
		this.r = r;
		
	}
	
	
	public Circle(int x, int y, int r) {
		//super(x,y);//상속한 변수는 super 메소드사용
		this.x = x;
		this.y = y;
		this.r = r;
		
	}
	
	
//	public Circle(int r) {
//		this.r = r;
//		x = y = 20;
//	}
	
	public void display() {
		super.display();
		System.out.println(x + ", " + y + ", "+ r);
	
	
	}
	
	public static void main(String[] args) {
		
		
		
	}
}

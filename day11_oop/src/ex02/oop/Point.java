package ex02.oop;

public class Point {
	private int x, y;

	public Point() {
		x = y = 100;
		System.out.println();
	}
	//==========================
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void display() {
		System.out.println(x+ " " + y);
		
	}
	
	public static void main(String[] args) {
		Point pt = new Point();
		pt.display();
	}
	
}

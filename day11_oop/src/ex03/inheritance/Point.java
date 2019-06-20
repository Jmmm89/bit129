package ex03.inheritance;

public class Point {
	protected int x,y;

	public Point() {
		x = y =10;
		System.out.println("point");
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point(int x) {
		super();
		this.x = x;
	}

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
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	public void display() {
		System.out.println(x + ", " + y);
	
	
	}
}

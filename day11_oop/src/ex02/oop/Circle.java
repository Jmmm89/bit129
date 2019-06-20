package ex02.oop;

public class Circle {

	private int x, y, z;

	public Circle(int x, int y )  {
		this.x = x;
		this.y = y;
		z = 5;
	}
	public Circle(int z) {
		this.z=z;
		x = 30;
		y = 50;
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

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void display() {
		System.out.println(x + ", " + y + ", " + z);
	}
	
}

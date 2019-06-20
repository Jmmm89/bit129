package ex01.oop;

class Rect {
	int x, y, x2, y2;
	//setter method
	public void setX(int x) {
		this.x = x;
		
	}
	public void setY(int y) {
		this.y = y;
		
	}
	public void setX2(int x2) {
		this.x2 = x2;
		
	}
	public void setY2(int y2) {
		this.y2 = y2;
		
	}
	// getter method
	public int getX() {
		return x;
		
	}

	public int getY() {
		return y;
		
	}
	public int getX2() {
		return x2;
		
	}
	public int getY2() {
		return y2;
		
	}

	 public void disp() {
		 
		 System.out.println("x + y + x2 + y2 = "+(x+y+x2+y2));
	 }
	
}//Rect end




public class MainRect {
	public static void main(String[] args) {
		
		Rect r = new Rect();
		r.setX(1);
		r.setY(2);
		r.setX2(3);
		r.setY2(4);
		r.disp();
		
		
	}
}

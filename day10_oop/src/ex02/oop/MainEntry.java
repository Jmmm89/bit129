package ex02.oop;

class Point {

	
	int x, y; // ¸â¹öº¯¼ö
	
	public void setX(int xx) {
		
		x = xx;
		
		
	}
	public void setY(int yy) {
		y=yy;
	}
	
	public void disp() {
		System.out.println(x + ", " + y);
	}
	
	
	public int getX() { return x; }
	public int getY() { return y; }
	
//	public void shwo (int a) {
//		System.out.println("aaa");
//		if ( a == 3 ) {
//			return;
//		}
//	}
	

}

class Circle{

private int x, y, r;  //setter, getter method

   public void setX(int xx) {	   
	   this.x = xx;  
   }
public void setY(int yy) {   
	   y = yy;	   
   }

public void setR(int rr) {   
	   r = rr;   
}

public int getX() {
	return x;
}
public int getY() {
	return y;
}
public int getR() {
	return r;
}

public void dis() {
	System.out.println("x * y * r = " + getX()*getY()*getR()  );
}

	// output method
	


	

}

class Rect{

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
	

}

public class MainEntry {

}

package ex01.oop;

public class MainCircle {
	public static void main(String[] args) {
		
	
	Circle cc = new Circle();
	cc.setR(1);
	cc.setX(2);
	cc.setY(3);
	cc.dis();

	
	}
}



class Circle {
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
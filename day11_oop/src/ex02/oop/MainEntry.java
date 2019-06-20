package ex02.oop;

public class MainEntry {
public static void main(String[] args) {
	
	Point pt = new Point();
	pt.display();
	System.out.println("================");
	
	Circle c = new Circle(10, 20);
	c.display();
	System.out.println("================");
	
	Circle c2 = new Circle(500);
	c2.display();
	c2.setX(1000);
	c2.setY(2000);
	c2.display();
	System.out.println("================");
	
	c2.setZ(3);
	c2.display();
	
}
}

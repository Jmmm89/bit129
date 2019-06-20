package ex03.Abstract;

import ex04.multiIMplements.Shape;

public class MainEntry {

	public static void main(String[] args) {
		
		
		//3
		
		Shape[] ss = new Shape[3];
		//Shape ss = new Shape(); 불가능
		ss[0] = new Circle();
		ss[1] = new Rect();
		ss[2] = new Triangle();
		
		String[] name = { "Circle", "Rect", "Trinangle" };
		for (int  i= 0;  i< ss.length; i++) {
			ss[i].show(name[i]);
		}
		System.out.println("==========================");
		
		
		
		
		
		// 2. shape  부모 추상 클래스를 이용해서 객체 생성
		
		Shape s = new Circle();
		s.show("원1");
		
		s = new Rect();
		s.show("사각형");
		
		s = new Triangle();
		s.show("삼각형");
		
		
		
		//각자의 클래스로 객체 생성 형태
		System.out.println("==========================");
		Circle c= new Circle();
		c.show("원");
		
		Rect r  = new Rect();
		r.show("사각형");
		
		Triangle t = new Triangle();
		t.show("삼각형");
		
		Shape sh = new Rect(); // 다형성 구현이 가능하다...
		sh.show("사각형");
		System.out.println("==========================");
		
		
		 
	}
	 
}

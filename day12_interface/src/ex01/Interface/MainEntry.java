package ex01.Interface;


interface A { //interface - abstarct method, final field만 갖는다.
	int x = 90;	//final static int x [기본적으로 final 과 static이 적용되어 리터럴을 적용해줘야한다]
	final int y = 8888;
	char ch = 'A';
	
	//추상메소드 , abstract 생략가능함 - 무조건 추상메소드이다.
	public void show();//public abstract void show();  abstract 가 생략 가능하다.
	public abstract void disp();
//	public void view(String name) {
//		"몸체를 가져서 에러가 뜸"
//	}
	
	
	
	
} // A end

interface B {
	void view();
} // B end

interface C {
	String name ="happy";
	public void draw();
} // C end

// interface 간에 상속에서도 extends 키워드 사용한다
interface D extends B {
	void dview();
} // D end

class Rect implements D {

	@Override
	public void view() {  // B interface method
		
	}

	@Override
	public void dview() {  // D interface method
		
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
} // Rect end

class Shape{
	
} // Shape end

class Multi extends Shape implements B, C, A { //

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}
	
} // Multi end

class Point implements A {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

} // Point end


class Circle implements C {

	@Override
	public void draw() {
		System.out.println(name + "님이네요.");
		
	}
	
} // Circle end

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();   c.draw();
		C cc = new Circle();   cc.draw();
		System.out.println("$$$$$$$$$$$$$$$$$");
		
		A a = new Point();
		a.disp();		a.show();
	}
}
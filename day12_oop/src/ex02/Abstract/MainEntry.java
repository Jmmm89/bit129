package ex02.Abstract;

abstract class Shape{ // 추상클래스 , super class
	
	double result = 0;
	public abstract double calc();//추상메소드
	public abstract void draw(); // 추상
	
	public void show() { //일반메소드
		System.out.println("super class shape");
		
	}
	
	
	
	
}//shape end

class Circle extends Shape {

	double r = 5.0;
	
	
	@Override
	public double calc() {
		result = r * r  * Math.PI;
		return result;
	}

	@Override
	public void draw() {
	 System.out.println("원의 넓이는 " + result + " 입니다.");
		
	}
	
}

class Triangle1 extends Shape{
	int w = 3, h =10;
	@Override
	
	public double calc() {
		result = (w * h)/2 ;
		return result;
	}

	@Override
	public void draw() {
		System.out.println("삼각형의 넓이는 " + result + " 입니다.");
		
	}
	
	
}
	
	
class Rect extends Shape{
	int w = 3, h =10;
	@Override
	public double calc() {
		result = w * h ;
		return result;
	}

	@Override
	public void draw() {
		 System.out.println("사각형의 넓이는 " + result + " 입니다.");
		
	}
	
}
	

public class MainEntry {
	public static void main(String[] args) {
		
		//Shape sh = new Shape(); 상속 받아야만 객체생성가능
		Circle c = new Circle();
		
		
		
		
		
		
		
	}
}

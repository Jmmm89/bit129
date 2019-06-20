package ex02.Abstract;


abstract class Shape1{ // 추상클래스 , super class
	
	double result = 0;
	public abstract double calc();//추상메소드
	public abstract void draw(); // 추상
	
	public void show() { //일반메소드
		System.out.println("super class shape");
		
	}
}
public class absabs extends Shape1{

	@Override
	public double calc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Shape1 sh1 = new absabs();
		sh1.show();//추상 메소드는 오버라이드 해서 사용하지만 일반 void나 return 메소드는 
	}

}


 


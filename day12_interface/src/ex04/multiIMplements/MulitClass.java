package ex04.multiIMplements;

import ex01.Interface.IDraw;

public class MulitClass extends Shape implements Test, IDraw {

	
	int num = 55;
	
	@Override
	public void draw() {
		System.out.println("아이드로우 인터페이스");
		
	}

	@Override
	public double calc(double x) {
		System.out.println("쉐이프 추상클래스");
		return 5.5;
	}

	@Override
	public void show(String name) {
		System.out.println("쉐이프 추상 클래스 쇼 메소드");
		
	}

	
	
	
}

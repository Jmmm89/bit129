package ex03.Abstract;

import ex04.multiIMplements.Shape;

public class Rect extends Shape {
	private double y = 5;
	@Override
	public double calc(double x) {
		result = x*y;
		return result;
	}

	@Override
	public void show(String name) {
		calc(5);
		System.out.println( name + " 의 크기는 " + result + "입니다.");
		
		
		
	}

}

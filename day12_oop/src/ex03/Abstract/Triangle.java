package ex03.Abstract;

import ex04.multiIMplements.Shape;

public class Triangle extends Shape {

	@Override
	public double calc(double x) {
		double y = 2.0;
		result = (x*y)/2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(5);
		System.out.println( name + " 의 크기는 " + result + "입니다.");
		
	}
	
	

}

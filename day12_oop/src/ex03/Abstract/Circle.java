package ex03.Abstract;

import ex04.multiIMplements.Shape;

public class Circle extends Shape {

	@Override
	public double calc(double x) {
		result = x*x*Math.PI;
		return result;
		
	
		
	}
	@Override
	public void show(String name) {
		
		calc(5.5);
		System.out.println( name + " 의 크기는 " + result + "입니다.");
		// TODO Auto-generated method stub

	}

}

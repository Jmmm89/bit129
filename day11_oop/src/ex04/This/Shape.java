package ex04.This;

import ex03.inheritance.Rect;

public class Shape extends Rect {

	int x, y;
	
	public Shape() {
		this(1,2);
	}
	
	public Shape(int x) {
		this(x,9999);
	}
	
	public Shape(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public void display() {
		
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		Rect r = new Rect();
		
	}
}

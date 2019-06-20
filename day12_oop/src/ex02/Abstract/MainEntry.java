package ex02.Abstract;

abstract class Shape{ // �߻�Ŭ���� , super class
	
	double result = 0;
	public abstract double calc();//�߻�޼ҵ�
	public abstract void draw(); // �߻�
	
	public void show() { //�Ϲݸ޼ҵ�
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
	 System.out.println("���� ���̴� " + result + " �Դϴ�.");
		
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
		System.out.println("�ﰢ���� ���̴� " + result + " �Դϴ�.");
		
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
		 System.out.println("�簢���� ���̴� " + result + " �Դϴ�.");
		
	}
	
}
	

public class MainEntry {
	public static void main(String[] args) {
		
		//Shape sh = new Shape(); ��� �޾ƾ߸� ��ü��������
		Circle c = new Circle();
		
		
		
		
		
		
		
	}
}

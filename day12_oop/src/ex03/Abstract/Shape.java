package ex03.Abstract;

public abstract class Shape {

	
	 double result = 0;
	 public abstract double calc(double x); //�߻�޼ҵ�
	 public abstract void show (String name) ;
	 public void view() {
		 System.out.println("Super class Shape");
	 }
}

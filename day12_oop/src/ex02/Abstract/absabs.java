package ex02.Abstract;


abstract class Shape1{ // �߻�Ŭ���� , super class
	
	double result = 0;
	public abstract double calc();//�߻�޼ҵ�
	public abstract void draw(); // �߻�
	
	public void show() { //�Ϲݸ޼ҵ�
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
		sh1.show();//�߻� �޼ҵ�� �������̵� �ؼ� ��������� �Ϲ� void�� return �޼ҵ�� 
	}

}


 


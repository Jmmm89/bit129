package ex04.multiIMplements;

import ex01.Interface.IDraw;

public class MulitClass extends Shape implements Test, IDraw {

	
	int num = 55;
	
	@Override
	public void draw() {
		System.out.println("���̵�ο� �������̽�");
		
	}

	@Override
	public double calc(double x) {
		System.out.println("������ �߻�Ŭ����");
		return 5.5;
	}

	@Override
	public void show(String name) {
		System.out.println("������ �߻� Ŭ���� �� �޼ҵ�");
		
	}

	
	
	
}

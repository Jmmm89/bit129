package ex03.Abstract;

import ex04.multiIMplements.Shape;

public class MainEntry {

	public static void main(String[] args) {
		
		
		//3
		
		Shape[] ss = new Shape[3];
		//Shape ss = new Shape(); �Ұ���
		ss[0] = new Circle();
		ss[1] = new Rect();
		ss[2] = new Triangle();
		
		String[] name = { "Circle", "Rect", "Trinangle" };
		for (int  i= 0;  i< ss.length; i++) {
			ss[i].show(name[i]);
		}
		System.out.println("==========================");
		
		
		
		
		
		// 2. shape  �θ� �߻� Ŭ������ �̿��ؼ� ��ü ����
		
		Shape s = new Circle();
		s.show("��1");
		
		s = new Rect();
		s.show("�簢��");
		
		s = new Triangle();
		s.show("�ﰢ��");
		
		
		
		//������ Ŭ������ ��ü ���� ����
		System.out.println("==========================");
		Circle c= new Circle();
		c.show("��");
		
		Rect r  = new Rect();
		r.show("�簢��");
		
		Triangle t = new Triangle();
		t.show("�ﰢ��");
		
		Shape sh = new Rect(); // ������ ������ �����ϴ�...
		sh.show("�簢��");
		System.out.println("==========================");
		
		
		 
	}
	 
}

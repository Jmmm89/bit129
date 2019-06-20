package ex04.multiIMplements;

public class MainEntry {
	public static void main(String[] args) {
		Shape s = new MulitClass();
		s.show("도형이야");
		
		
		Test t = new MulitClass();
		t.view();
		System.out.println(t.str);
		
		MulitClass mc = new MulitClass();
		mc.draw();
		System.out.println(mc.num);
		System.out.println(mc.su);
		
	}
}

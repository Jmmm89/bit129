package ex06.inner;

import ex06.inner.OuterClass.InnerClass;

class OuterClass { 
	
	static int no;
	String message = "hi~~~";
	
	public void outerMethod() {
		System.out.println("outer method call");
	}
	
	class InnerClass{ //inner start
		
		int su = 555;
		public void show() {
			System.out.println(su); //����(�ڽ��ǰ�)��� ����
			System.out.println(message); // �ܺ� Ŭ���� ��� ��밡�� , ��  outer�� inner ������ �Ҽ�����.
		}
		public void disp() {
			outerMethod();
			
		}
		
	}//Inner end
	
} //Outerclass end

public class MainEntry {
	public static void main(String[] args) {
	
		//1.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass oic = oc.new InnerClass();
		oic.show(); oic.disp();
		
		//2.
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.disp();
	}
}

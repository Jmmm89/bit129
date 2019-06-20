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
			System.out.println(su); //내부(자신의것)사용 가능
			System.out.println(message); // 외부 클래스 멤버 사용가능 , 단  outer가 inner 접근은 할수없다.
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

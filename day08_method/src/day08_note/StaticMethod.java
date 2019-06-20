package day08_note;

// static method : 객체 생성없이 사용가능
// object.methodName();
// ClassName.methodName();

class A {
	int x, y;
	//static method
	public static void setdata(int xx, int yy) {
		System.out.println(xx + ", "+yy);
	}
}//class A end


public class StaticMethod {
public static void main(String[] args) {
	A a = new A();//객체 생성, 메모리에 할당, 생성자함수 자동 호출
	a.x=9;
	a.setdata(100, 200);
	A.setdata(3,4);
}
}

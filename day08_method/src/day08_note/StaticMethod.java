package day08_note;

// static method : ��ü �������� ��밡��
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
	A a = new A();//��ü ����, �޸𸮿� �Ҵ�, �������Լ� �ڵ� ȣ��
	a.x=9;
	a.setdata(100, 200);
	A.setdata(3,4);
}
}

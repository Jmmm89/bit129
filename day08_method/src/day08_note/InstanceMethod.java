package day08_note;



class B {
	int x , y;
	//instance method - 주로활용함
	public void setData(int xx, int yy) {
		System.out.println(xx + ", "+ yy);
	}
}
public class InstanceMethod {
public static void main(String[] args) {
	B b = new B(); // 객체 , 메모리 할당, 생성자 함수 자동호출
	
	b.setData(20, 50);
}
}

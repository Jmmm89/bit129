package day08_note;



class B {
	int x , y;
	//instance method - �ַ�Ȱ����
	public void setData(int xx, int yy) {
		System.out.println(xx + ", "+ yy);
	}
}
public class InstanceMethod {
public static void main(String[] args) {
	B b = new B(); // ��ü , �޸� �Ҵ�, ������ �Լ� �ڵ�ȣ��
	
	b.setData(20, 50);
}
}

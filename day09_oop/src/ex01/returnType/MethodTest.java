package ex01.returnType;

public class MethodTest {

	public static int methodEx(double d1, double d2 ) {
		
		double hap = d1+d2;
		
		//�Լ�Ÿ���� �켱������ ��������Ѵ�
		return (int)hap; // int �޼ҵ�� int�� ����/ ����Ÿ�� != �Լ�Ÿ�� ����
		
		
	}
	
	public static void main(String[] args) {
		
		int result = methodEx(1.2, 3.4);
	}
	
	
}

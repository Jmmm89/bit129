package day08_note;

public class To_do {
	
	
	// 1. �Ű�����X ����Ÿ��X

	public static void display() { // �Լ� ���Ǻ�
		System.out.println("�ȳ��ϼ���");
		System.out.println("�����̴���");
	}
	
public static void plus ( int x, int y, String msg ) {
	
	System.out.println("hap = " + (x+y));
	int sum = x + y;
	System.out.println("sum = " + sum);
	System.out.println(msg);
}
	public static void total ( int kor, int eng, int com) {
		
		int total = kor+eng+com;
		System.out.println(total);
		
	
}
  
	
	
	
	
public static void main(String[] args) {
	plus(100, 5, "����");
	
	System.out.println("main start~~~~");
	display(); // �Լ�ȣ��
	
	System.out.println("main end!!!");
	
	
	
}

}
package ex01.returnType;

public class MainEntry {
	
	//�Լ� �����
	//1. �Լ� ���Ǻ� �����
	//2. �����Լ����� ȣ���ؼ� �����
	
	
public static void main(String[] args) {
	
	int x = 3 , y = 5;
	
	
	
	int result = methodEx1(x,y);
	System.out.println(result);
	int[] arrResult = methodEx2();
	for(int i = 0 ; i < arrResult.length; i++) {
		System.out.println(arrResult[i]+ " ");
}
}

	public static int[] methodEx2() {
		int[] arr = {1,2,3,4,5,6};
		return arr; // �������� ������ ������ �迭, ��ü(object)�� �����Ѵ�.
	}


	public static int methodEx1(int x, int y) {
		// TODO Auto-generated method stub
		return x+y; // ���� ���� 1����, ��ǥ�� ������ ����
	}


	
}



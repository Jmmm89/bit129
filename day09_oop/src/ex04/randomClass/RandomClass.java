package ex04.randomClass;

import java.util.Random;

public class RandomClass {

	
	public static void main(String[] args) {
		Random rand = new Random(); // ��ü ���� , �޸𸮿� �Ҵ�, �������Լ� �ڵ�ȣ��
		
		System.out.println(rand.nextBoolean()); //data type�� ũ�⸸ŭ ����Ѵ�
		//rand.nextInt(n); = 0~ n-1���� ������
		
		System.out.println(rand.nextInt(5)); // 0~4����
		System.out.println(rand.nextInt(100)+1);
		
		for ( int i = 1; i < 7; i ++) {
			System.out.print(rand.nextInt(45)+1+ " ");
			
			
		}
		System.out.println();
		int ran = random(5);
		System.out.println("�޼ҵ� random�� ���� 5�� ��°��� = " +ran);
	}
	//���� ������ ���� 1~100 / 5�� ��ȸ�� ���� �Է� ������ �˸�+������� 
	// ��ȸ �����ϸ� ���� �˸� +�������
	// ����� �Է´��� ���ؼ� ũ�� up ������ down ���
	
	public static int random(int number) {
		Random ran = new Random();
		
		number = ran.nextInt(number);
		
		
		
		return number;
	}
	
	
}

package ex03.randomMethod;

public class MathRandom {

	
	public static void main(String[] args) {
		
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		//random() : ���� �߻� 0.0 ~ 1.0
		System.out.println();
		System.out.println(Math.random());
	    // 0 ~ n-1 �� ��� ���ϸ� 
		System.out.println(Math.random() * 5);
		// ��°� 1~ 5
		System.out.println((Math.random() * 5)+1);
		System.out.println((int)(Math.random() * 10)+1);
		
		//�ζ� 1~45
		System.out.println((Math.random() * 45)+1);//0���� ~45���� �ϱ� +1���ش�
		 int [] a = new int [5];
		for (int i = 1; i < 7 ; i ++) {
			System.out.print((int)(Math.random() * 45)+1+ " ");//�迭��� ���ϼ� ����, ������� �迭
		}
	}
}

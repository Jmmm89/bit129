package ex02.array;

public class ArrayEx5 {
public static void main(String[] args) {
	// �� �� �� ��
	//1.
	 int [][] a= new int [2][3];
	 a[0][0] = 1; //�ʱ�ȭ
	 a[0][1] = 2;
	 a[0][2] = 3;
	 
	 a[1][0] = 4;
	 a[1][1] = 5;
	 a[1][2] = 6;
	 
	 //2.
	 int [][] a2 = new int [][] {{1,2,3},{4,5,6}};
	 
	 //3. 
	 
	 int [][] a3 = { {1,2,3}, {4,5,6}}; // �ʱ�ȭ
	 
	 // for������ �迭 �� ��� ��ü�� a.length �ุ�� a[0].length ������ a[1].length 
	 
	 for (int i = 0; i < 2; i++) {
		 for( int i2 = 0; i2 < 3; i2++ ) {
			 System.out.println(a3[i][i2] + " ");
		
	}
		 System.out.println();
		 
	 }
	 
	 
	 System.out.println("======================");
	 
	 System.out.println("�迭�� ��ũ�� : " + a3.length);
	 System.out.println("�迭�� ��ũ�� : " + a3[0].length);
	 
	 for (int i = 0; i < a.length; i++) {
		 for( int i2 = 0; i2 < a2[i].length; i2++ ) {
			 
			 System.out.println(a3[i][i2] + " ");
	 
	 
		 }
	 }
}
}

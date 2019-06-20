package ex04.randomClass;

public class Quiz02_lottery {

	// ���� 2] �ζ� ���α׷� �ۼ�
	// ���� 1~45 ���� �߿��� 6�� ���� ( ��, �������� �������
	// �ߺ� üũ ���� 
	public static int[] lotto() {
		
		int loddo1;
		int[] loddo = new int [6]; 
		for (int i = 0; i < loddo.length; i++ ) {
			loddo1 = ((int)(Math.random() *6)+1);
			loddo[i]= loddo1;
		}
			
		return loddo;

	}
	
	public static int[] invest(int[]l) {
		 
		
		
		for (int i = 0; i < l.length; i++) { //�ߺ� �˻� ���			
			
			for (int j = 0; j < i; j++) { //�ߺ� �˻� �񱳰�
				if (l[i] == l[j]) { // �ߺ� �˻� ���=�񱳰�
					l[i] = ((int)(Math.random()*6)+1); //�ߺ� �˻� ����� �����
					i--;                      //������� �ܺ��� �ߺ� �˻縦 �����
				
				}
			}
	
		}
		return l;
		
		
	}
		
	
	
	
	public static void main(String[] args) {
		
		int[] l = lotto();
		System.out.print("�ߺ� �ִ� �� : ");
		for (int i = 0; i < l.length; i++) {
		System.out.print(l[i] + " ");
		}
		System.out.println();
		
		invest(l);
		
		System.out.print("�ߺ� ���� �� : ");
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i] + " ");	
		}
		
	}
}

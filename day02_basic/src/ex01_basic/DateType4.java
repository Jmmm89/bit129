package ex01_basic;

public class DateType4 {

	public static void main(String[] args) {
	     int su = 10;
	     
	     System.out.println("10���� : " + su); // %d(������), %o(8����), %x(16����), %X
	     System.out.printf("10���� : %d\n" , su);
	     System.out.printf("8���� : %o\n" , su);
	     System.out.printf("16���� : %x %X" , su, 10);
	     System.out.println();
	     System.out.printf("%d %x %o %X \n" , 10, 10, 10, 10);
	     
	     //0���� --> 8����, 0x���� --> 16����
	     System.out.printf("%d \n", 012); // 012(8����) --> 10����
	     System.out.printf("%d \n" , 0xA); // 0xA(16����) --> 10���� ���
	     
	     
	     System.out.println("======================");
	     
	     double f = 12.34;
	     System.out.println(f);
	     float ff = 5.6f;   // �ڿ��� ���� �б� ������ ����� �ν��Ѵ� ����� ����ȯ�� ���� ������ ����
	     System.out.println(ff);
		
	}

}

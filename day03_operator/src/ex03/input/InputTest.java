package ex03.input;
//import java.lang.*; �⺻�Է�
//import java.util. *; // ��ƿ ��Ű�� ���δ�
import java.util.Scanner; //  ��ƿ ��Ű�� �ȿ� ��ĳ�� Ŭ���� only
public class InputTest {
  public static void main(String[] args) {
	
	   // ǥ���Է� : System.in
	  Scanner scan = new Scanner(System.in);
	  System.out.print("���� ������ �Է� ��� : ");
	  int su = scan.nextInt();
	  double x = scan.nextDouble();
	  //			nextFloat()
	  //			nextDouble()
	  //next() vs 	nextLine() <--- String input method
	  System.out.println("\n\n�Է� ���� �� : " + su);
	  System.out.printf("�Է� ���� �� : %f"+ x);
	  
	  // �ڹٴ� �ڵ����� ����Ʈ ���ִ� ��Ű���� �ִ�. - java.lang
	  
}
}

package ex02.Switch;

import java.util.Scanner;

public class Controller_Switch {
public static void main(String[] args) {
	System.out.print("point ? ");
	
	int point = new Scanner(System.in).nextInt();
	
	switch(point) {//������ ������ (long ����) �Ǽ���x
	//jdk 6.0 ���Ͽ����� ���ڿ� �Է� x
	case 1 : 
		System.out.println("����Ʈ ���� 1���Դϴ�");
		break;
		
	case 2 : 
		System.out.println("����Ʈ ���� 2���Դϴ�");
		break;
		
	case 3 : 
		System.out.println("����Ʈ ���� 3���Դϴ�");
		break;
	
	default :
		System.out.println("1~3������ �Է� �ϼ���");
}//switch end
}
}

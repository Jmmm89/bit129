package ex01.next;

import java.util.Scanner;

public class MainEntry {
public static void main(String[] args) {
	//next() vs nextLine() �޸�?
	//next()�� �Է��� ������ enter�� buffer�� ����
	Scanner sc = new Scanner(System.in);
	System.out.println("�̸� �Է±�");
	System.out.println("================");
	String name = sc.next();
	String something = sc.next();//����ó��
	String s   = sc.next();
	
	System.out.println( name + something + s);
}
}

package todo2;

import java.util.Scanner;

public class Triangle2 extends Draw {

	public double a ,b;
	
	public static void main(String[] args) {
		
		Draw d = new Draw();
		Scanner scan = new Scanner(System.in);
		System.out.println("�Ѻ��� ���� a : ");
		
		
	}
	
	
	
	public double Tize(double a, double b) {
		
		return (a*b)/2;
	}
	public String toString() {
		return "���� ���̴�"+Tize(a,b) + "�Դϴ�.";
	}
	
	
	
}

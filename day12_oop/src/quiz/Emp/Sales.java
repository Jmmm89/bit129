package quiz.Emp;

import java.util.Scanner;

public class Sales extends Regular{

	int PI;
	
	public int getPI() {
		return PI;
	}

	public void setPI(int PI) {
		this.PI = PI;
	}

	public Sales(){
		super();
		PI = (int)(getPay()*0.3);
		Input2();
	}

	public void Input2() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �����Է�");
		System.out.print("��� : ");
		saNum = scan.nextInt();
		System.out.print("����ó : ");
		pNum = scan.nextInt();
		System.out.print("�̸� : ");
		name = scan.next();
		System.out.print("���� : ");
		rank = scan.next();
		
		scan.close();
		
		
	}
	
	
	@Override
	public String toString() {
		return "Sales [PI=" + PI + ", getPay()=" + getPay() + ", toString()=" + super.toString() + ", getSaNum()="
				+ getSaNum() + ", getpNum()=" + getpNum() + ", getName()=" + getName() + ", getRank()=" + getRank()
				+ "]";
	}
	
	
	
	
}

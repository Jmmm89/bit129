package quiz.Emp;

import java.util.Scanner;

public class Regular extends Emp {

	protected int pay;
	

	Regular (){
		super();
		pay = 3000;
		Input1();
	}
	
	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public void Input1() {
		
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
		return "Regular [�޿�=" + pay + ", ���=" + getSaNum() + ", ����ó=" + getpNum() + ", �̸�="
				+ getName() + ", ����=" + getRank() + "]";
	}
	
}

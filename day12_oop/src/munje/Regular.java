package munje;

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
		
		
		System.out.println("��� �����Է�");
		System.out.print("��� : ");
		setSaNum(new Scanner(System.in).nextInt());
		System.out.print("����ó : ");
		pNum = new Scanner(System.in).nextInt();
		System.out.print("�̸� : ");
		name = new Scanner(System.in).next();
		System.out.print("���� : ");
		rank = new Scanner(System.in).next();
		
		
		
		
	}
	
	
	@Override
	public String toString() {
		return "������ [�޿�=" + pay + ", ���=" + getSaNum() + ", ����ó=" + getpNum() + ", �̸�="
				+ getName() + ", ����=" + getRank() + "]";
	}
	
}

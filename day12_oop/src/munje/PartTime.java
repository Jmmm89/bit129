package munje;

import java.util.Scanner;

public class PartTime extends Regular {

	private int PTpay ,day, time;
	
	
	public int getPTpay() {
		return PTpay;
	}


	public void setPTpay(int pTpay) {
		PTpay = pTpay;
	}


	public PartTime() {
		super();
		PTpay();
		
	}
	
	@Override
	public String toString() {
		return "����� [�޿�=" + PTpay + 
				 ", ���=" + getSaNum() + ", ����ó=" + getpNum() + ", �̸�=" + getName()
				+ ", ����=" + getRank() + "]";
	}


	public void PTpay() {
		  System.out.print("���� �ð� : ");
		   time = new Scanner(System.in).nextInt();
		   System.out.print("�Ѵް� ���� �� �ϼ� : ");
		   day = new Scanner(System.in).nextInt();
		   PTpay = day*(time*7800);
	}
	
	
}

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
		return "계약직 [급여=" + PTpay + 
				 ", 사번=" + getSaNum() + ", 연락처=" + getpNum() + ", 이름=" + getName()
				+ ", 직급=" + getRank() + "]";
	}


	public void PTpay() {
		  System.out.print("업무 시간 : ");
		   time = new Scanner(System.in).nextInt();
		   System.out.print("한달간 업무 총 일수 : ");
		   day = new Scanner(System.in).nextInt();
		   PTpay = day*(time*7800);
	}
	
	
}

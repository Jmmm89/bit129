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
		
		
		System.out.println("사원 정보입력");
		System.out.print("사번 : ");
		setSaNum(new Scanner(System.in).nextInt());
		System.out.print("연락처 : ");
		pNum = new Scanner(System.in).nextInt();
		System.out.print("이름 : ");
		name = new Scanner(System.in).next();
		System.out.print("직급 : ");
		rank = new Scanner(System.in).next();
		
		
		
		
	}
	
	
	@Override
	public String toString() {
		return "내근직 [급여=" + pay + ", 사번=" + getSaNum() + ", 연락처=" + getpNum() + ", 이름="
				+ getName() + ", 직급=" + getRank() + "]";
	}
	
}

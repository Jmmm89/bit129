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
		System.out.println("내근직 정보입력");
		System.out.print("사번 : ");
		saNum = scan.nextInt();
		System.out.print("연락처 : ");
		pNum = scan.nextInt();
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("직급 : ");
		rank = scan.next();
		
		
		scan.close();
		
	}
	
	
	@Override
	public String toString() {
		return "Regular [급여=" + pay + ", 사번=" + getSaNum() + ", 연락처=" + getpNum() + ", 이름="
				+ getName() + ", 직급=" + getRank() + "]";
	}
	
}

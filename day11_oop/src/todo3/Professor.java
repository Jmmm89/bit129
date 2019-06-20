package todo3;

import java.util.Scanner;

public class Professor extends Student {

	String major = null;
	String rank = null;
	int pNum;
	
	public String getmajor() {
		return major;
	}

	public void setPart(String major) {
		this.part = major;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

public void Input() {
		
		System.out.println("교수정보 입력");
		Scanner scan = new Scanner(System.in);
		//이름
		System.out.print("이름입력 : ");
		name = scan.nextLine();
		//키
		System.out.print("키입력 : ");
		tall = scan.nextInt();
		//몸무게
		System.out.print("몸무게입력 : ");
		weight = scan.nextInt();
		//학과
		System.out.println("학과입력 : ");
		major = scan.nextLine();
		major = scan.nextLine();
		//직급
		System.out.print("직급입력 : ");
		rank = scan.nextLine();
		//학년
		System.out.print("교번입력 : ");
		pNum = scan.nextInt();
		scan.close();
	}
	
	
	@Override
	public String toString() {
		return "교수 [학과=" + major + ", 직급=" + rank + ", 교번=" + pNum + ", 이름=" + getName()
				+ ", 키=" + getTall() + ", 몸무게=" + getWeight()+ "]";
	}

	public Professor() {
		super();
		this.part = null;
		this.major = null;
		this.pNum = 0;
		Input();
	}

	
}

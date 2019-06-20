package todo3;

import java.util.Scanner;

public class Student extends Person {
	//학과 , 학번, 학년
	String part=null;
	int num, grd;
	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getGrd() {
		return grd;
	}

	public void setGrd(int grd) {
		this.grd = grd;
	}

	public void Input() {
		
		System.out.println("학생정보 입력");
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
		System.out.print("학과입력 : ");
		part = scan.nextLine();
		part = scan.nextLine();
		
		//학번
		System.out.print("학번입력 : ");
		num = scan.nextInt();
		//학년
		System.out.print("학년입력 : ");
		grd = scan.nextInt();
//		scan.close();
	}
	
	
	
	@Override
	public String toString() {
		return "학생 [학과=" + part + ", 학번=" + num + ", 학년=" + grd + ", 이름=" + getName() + ", 키="
				+ getTall() + ", 몸무게=" + getWeight() ;
	}
	public Student() {
		super();
		this.part=null;
		this.num=0; 
		this.grd=0;
		Input();
	}
	
	
	
	
		
	}


	
	


package todo3;

import java.util.Scanner;

public class Student extends Person {
	//�а� , �й�, �г�
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
		
		System.out.println("�л����� �Է�");
		Scanner scan = new Scanner(System.in);
		//�̸�
		System.out.print("�̸��Է� : ");
		name = scan.nextLine();
		//Ű
		System.out.print("Ű�Է� : ");
		tall = scan.nextInt();
		//������
		System.out.print("�������Է� : ");
		weight = scan.nextInt();
		//�а�
		System.out.print("�а��Է� : ");
		part = scan.nextLine();
		part = scan.nextLine();
		
		//�й�
		System.out.print("�й��Է� : ");
		num = scan.nextInt();
		//�г�
		System.out.print("�г��Է� : ");
		grd = scan.nextInt();
//		scan.close();
	}
	
	
	
	@Override
	public String toString() {
		return "�л� [�а�=" + part + ", �й�=" + num + ", �г�=" + grd + ", �̸�=" + getName() + ", Ű="
				+ getTall() + ", ������=" + getWeight() ;
	}
	public Student() {
		super();
		this.part=null;
		this.num=0; 
		this.grd=0;
		Input();
	}
	
	
	
	
		
	}


	
	


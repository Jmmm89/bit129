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
		
		System.out.println("�������� �Է�");
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
		System.out.println("�а��Է� : ");
		major = scan.nextLine();
		major = scan.nextLine();
		//����
		System.out.print("�����Է� : ");
		rank = scan.nextLine();
		//�г�
		System.out.print("�����Է� : ");
		pNum = scan.nextInt();
		scan.close();
	}
	
	
	@Override
	public String toString() {
		return "���� [�а�=" + major + ", ����=" + rank + ", ����=" + pNum + ", �̸�=" + getName()
				+ ", Ű=" + getTall() + ", ������=" + getWeight()+ "]";
	}

	public Professor() {
		super();
		this.part = null;
		this.major = null;
		this.pNum = 0;
		Input();
	}

	
}

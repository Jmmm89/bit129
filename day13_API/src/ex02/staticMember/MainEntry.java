package ex02.staticMember;


class Atm{
	int count; // instance member
	static int total; // static member
	
	public Atm(int amount){ // counstructor method
		count += amount;
		total += amount;
	}
	
	
	//static method ���� �Ϲ� ��������� ��� �� �� ����.
	public static void view() {
		total = total + 100;
		//count = count + 100;
		
	}
	
	
	// static member���� this��� �Ҽ� ����.
	public void show ( int count, int total) {
		this.count = count;
		Atm.total = total; // this.total �ȵ�..
	}
	
	
	public void display() {
		System.out.println("count = " + count );
		System.out.println("total = " + total );
	}
	
	
	
}//Atm end


public class MainEntry {

	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm at = new Atm(1000);
		at.display();
		System.out.println("=========================");
		Atm at2 = new Atm(1000);
		at.display();
		System.out.println("=========================");
		Atm at3 = new Atm(1000);
		at.display();
		System.out.println("==========================");
	}
	
}

package ex04.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

class Info{
	Scanner scan = new Scanner(System.in);
	String name ,address, tel;
	
	
	
	public Info() {
	
		System.out.println("�� ������ �Է��ϼ���.");
		System.out.print("�̸� : ");
		this.name= scan.next();
		System.out.print("�ּ� : ");
		this.address = scan.next(); 
		System.out.print("��ȭ��ȣ : ");
		this.tel= scan.next();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}



	
	
}

 class Manager extends Info{
	 int i;
	 ArrayList<String> list = new ArrayList();
	 
	//�� �߰� / ���� / �� ����Ʈ ��� / ���� / ���α׷� ����
	//������ �Լ����� �������� �ް�  do while���� �̿��ؼ� ��ƾ�� �����. switch������ 12345 �Է����޾Ƽ�
	// �� �޼ҵ带 ȣ���Ѵ�.
	public Manager() {
		super();
	}
	 
	 public void Cusadd() {
		 
		 list.add(new String(getName()+"/"+getTel()+"/"+getAddress()));
	 }
	 
	 public void Cussub() {  //������ ���� �޼ҵ�
		 list.remove(i);
	 }
	 
	 public static void Cusdisp(ArrayList<String> list) { //������ ��� �޼ҵ�
		 System.out.println("������  : " + list);
	 }

	 public void CusEdit() {
		    int i = scan.nextInt();
//		 list.set(i, setName()+setTel()+setAddress()); 
	 }
	 
 }





public class Customer {

	//������ �Լ�, �°� �޼ҵ�, �ƿ�ǲ �޼ҵ�
	
	
	
	
	
	
	
}

package ex4.collection.map;
import java.util.ArrayList;
import java.util.Scanner;


class Info{
	
	protected String name, tel, part, rank, pay;
	static int sabun = 1000;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	
	

} // Info End

class process extends Info{
	
	Scanner scan = new Scanner(System.in);
	ArrayList<String> list =new ArrayList();
	
	public void Input() { // ��ĳ�ʷ� 5�� �Է¹�������
		System.out.println("���������� �Է��ϼ���.");
		System.out.print("�̸� : ");
		setName(scan.next());
		System.out.print("����ó : ");
		setTel(scan.next());
		System.out.print("�μ� : ");
		setPart(scan.next());
		System.out.print("��å : ");
		setRank(scan.next());
		System.out.print("���� : ");
		setPay(scan.next());
		
	
	}

	
	
	//Emp �߰�
	void add() { //�� ǲ ���� �Է� �������� �������� ����Ʈ �޼ҵ� �־��ּ���
		Input();
		sabun++;
		list.add(new String(getName()+getTel()+getPart()+getRank()+getPay()+sabun));
		list();
	}
	
	
	
	//Emp ����
	void remove() {
		int i = 0;
		System.out.println("������ ���������� �����ϼ���. ");
		i = scan.nextInt();
		list.remove(i);
		
		//array ����
		// list �޼ҵ�
		
	}
	
	// Emp ����Ʈ ���
	void list() {
		// ��� ��ü ���
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+"��° ������ : "+list.get(i));
		}
			
		}
	//list end

		
	
	
	//Emp ����
	void edit() {
		
		list.add(i,get);
		
	}
	
	// ����
	
	
	
	
}








public class Emp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		
		
		do {
			
			
			
			
			
			
		}while(true);
		
	}	
	
	
	
}

package ex4.collection.map;

import java.text.SimpleDateFormat;
import java.util.*;


class Infor {
	
	protected String title, category, lend, lendName, lendDate;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLend() {
		return lend;
	}

	public void setLend(String lend) {
		this.lend = lend;
	}

	public String getLendName() {
		return lendName;
	}

	public void setLendName(String lendName) {
		this.lendName = lendName;
	}

	public String getLendDate() {
		return lendDate;
	}

	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}
	
	
	
	
	
}//Infor end

class Vmanager2 extends Infor{
	
	HashMap video = new HashMap();
	Scanner scan = new Scanner(System.in);
	//��ǲ �޼ҵ�
	public void Input() {
		
		System.out.println("���� ������ �Է��ϼ���.");
		setTitle(scan.next());
		System.out.println("���� �帣�� �Է��ϼ���.");
		setCategory(scan.next());
		System.out.println("���� �뿩���θ� �Է��ϼ���.y/n");
		setLend(scan.next());
		if (getLend().equals("y")) {
			System.out.println("�뿩�� �̸��� �Է��ϼ���.");
			setLendName(scan.next());
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd EEEE");
			setLendDate(sdf.format(d));
			video.put(getTitle(), "�帣 : " + getCategory()+"/ �뿩���� : "+getLend()+"/ �뿩�ڸ� : "+getLendName()+"/ �뿩�� : "+getLendDate()); List();}
			else if (getLend().equals("n")) {
				video.put(getTitle(), "�帣 : " + getCategory());}
		
		
	}
	
	
	//���� �߰� �޼ҵ�
		public void addVideo() {
			Input();
			
			List();
			}
			
		
	
		//���� ����Ʈ ��� �޼ҵ�
		
		public void List() {
			Set set = video.entrySet();
			Iterator vit = set.iterator();
			
			while(vit.hasNext()) {
				Map.Entry e = (Map.Entry)vit.next();
				System.out.println("��ȭ ����  : " + e.getKey() + "\n ��ȭ���� \n " + e.getValue());
			}
			
			
	
		}
		//���� ���� �޼ҵ�
		
		public void Vremove() {
			System.out.println("�ݳ��� �Ϸ�� ��ȭ ������ �Է��ϼ���. ");
			setTitle(scan.next());
			video.remove(getTitle());
				
			
		}

	//���� ���� �޼ҵ�
		public void Vedit() {
			System.out.println("������ ��ȭ ������ �Է��ϼ���. ");
			addVideo();
		}
		
		
	
	
	
}






public class Video2 {

	// title ��������  ��, category �帣 , lend �뿩����
	// lendName �뿩��(����), lendDate �뿩����(���ó�¥ �Է�)
	// �����߰�/����/����/����Ʈ���/���� ���α׷� �ۼ�
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Vmanager2 vm = new Vmanager2();
		int i=0;
		
		do {
			System.out.println("==���� �뿩 ���� ���α׷�==");
			System.out.println("���ϴ� ����� �����ϼ��� 1~5 ");
			System.out.println("1.�����߰� 2.�������� 3.�������� 4.����Ʈ��� 5.����");
			i = scan.nextInt();
			switch(i) {
			case 1 : vm.addVideo();break;//���� �߰�
			case 2 : vm.Vremove();break;//���� ����
			case 3 : vm.Vedit();break;//���� ����
			case 4 : vm.List();break;//���� ����Ʈ ���
			case 5 : System.out.println("���α׷��� �����մϴ�." );break;//���� ���� ���α׷�
			}
			
			
			
			
			
		}while(i<5);
		
		
	}
	
	
}

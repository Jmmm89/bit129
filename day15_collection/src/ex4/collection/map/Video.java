package ex4.collection.map;


import java.util.*;

class CusInfo {
	Scanner scan = new Scanner(System.in);
	protected String title, category, lend, lendName, lendDate;

	public void Input() { //�� ������ �̿��ؼ� ���� �뿩���θ� ���� ���� �Է¹޴´� y/n�� �Է��Ҽ� �ְԲ� �������� free
		System.out.println("���� �뿩���θ� �Է��ϼ���.y/n");
		setLend(scan.next());
		System.out.println("���� ������ �Է��ϼ���.");
		setTitle(scan.next());
		System.out.println("���� �帣�� �Է��ϼ���.");
		setCategory(scan.next());
		System.out.println("�뿩�� �̸��� �Է��ϼ���.");
		setLendName(scan.next());	}
	
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
	
	
	
	
} // cusinfo end

class Vmanager extends CusInfo{

	
	private HashMap video = new HashMap();
	
	
	//category, lend, lendName,
	
	public void Video(String VideoName) {
		CusInfo CI = new CusInfo();
		if(!video.containsKey(CI.getTitle())){
			video.put(CI.getTitle(), new HashMap());
		}
	}
//	static void addPhoneNo(String groupName, String name, String tel) {
//		//���� ��ǲ�� �ְ�
//		addGroup(groupName); //���� �׷��߰� �޼��带 �Է��Ѵ� 
//		HashMap group = (HashMap)phoneBook.get(groupName); // �׷쿡 �׷���� ���� �߰��ϴ� �κ�
//		group.put(tel, name);	// �̸��� �ߺ��� �� ������ ��ȭ��ȣ�� key�� �����Ѵ�.
	
	public void addInfo() {
		CusInfo CI = new CusInfo();
		CI.Input();
		Video(CI.getTitle());
		HashMap group = (HashMap)video.get(CI.getTitle());
		if(!video.containsKey(CI.getLend()=="y")){
			video.put(CI.getLend(), new HashMap());
		group.put(CI.getLendName(), CI.getLendDate());
	} else if (!video.containsKey(CI.getLend()=="n")){
		video.put(CI.getTitle(), CI.getCategory());
		}

	}//addInfo end
	
	public void disp() {
	Set set = video.entrySet();
	Iterator vit = set.iterator();
	
	
	
	
	}
		
	
	
	
}











public class Video {

	// title ��������  ��, category �帣 , lend �뿩����
	// lendName �뿩��(����), lendDate �뿩����(���ó�¥ �Է�)
	// �����߰�/����/����/����Ʈ���/���� ���α׷� �ۼ�
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Vmanager vm = new Vmanager();
		int i=0;
		
		do {
			System.out.println("==���� �뿩 ���� ���α׷�==");
			System.out.println("���ϴ� ����� �����ϼ��� 1~5 ");
			System.out.println("1.�����߰� 2.�������� 3.�������� 4.����Ʈ��� 5.����");
			i = scan.nextInt();
			switch(i) {
			case 1 : vm.addInfo(); break;//���� �߰�
			case 2 : break;//���� ����
			case 3 : break;//���� ����
			case 4 : break;//���� ����Ʈ ���
			case 5 : System.out.println("���α׷��� �����մϴ�." );break;//���� ���� ���α׷�
			}
			
			
			
			
			
		}while(i<5);
		
		
	}
}

	
	
	
	
	
	


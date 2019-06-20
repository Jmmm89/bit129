package ex4.collection.map;


import java.util.*;

class CusInfo {
	Scanner scan = new Scanner(System.in);
	protected String title, category, lend, lendName, lendDate;

	public void Input() { //두 와일을 이용해서 비디오 대여여부를 먼저 따로 입력받는다 y/n만 입력할수 있게끔 나머지는 free
		System.out.println("비디오 대여여부를 입력하세요.y/n");
		setLend(scan.next());
		System.out.println("비디오 제목을 입력하세요.");
		setTitle(scan.next());
		System.out.println("비디오 장르를 입력하세요.");
		setCategory(scan.next());
		System.out.println("대여자 이름을 입력하세요.");
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
//		//정보 인풋을 넣고
//		addGroup(groupName); //비디오 그룹추가 메서드를 입력한다 
//		HashMap group = (HashMap)phoneBook.get(groupName); // 그룹에 그룹명을 맵을 추가하는 부분
//		group.put(tel, name);	// 이름은 중복될 수 있으니 전화번호를 key로 저장한다.
	
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

	// title 비디오제목  ㅡ, category 장르 , lend 대여여부
	// lendName 대여자(고객명), lendDate 대여일자(오늘날짜 입력)
	// 비디오추가/삭제/수정/리스트출력/종료 프로그램 작성
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Vmanager vm = new Vmanager();
		int i=0;
		
		do {
			System.out.println("==비디오 대여 관리 프로그램==");
			System.out.println("원하는 기능을 선택하세요 1~5 ");
			System.out.println("1.정보추가 2.정보삭제 3.정보수정 4.리스트출력 5.종료");
			i = scan.nextInt();
			switch(i) {
			case 1 : vm.addInfo(); break;//비디오 추가
			case 2 : break;//비디오 삭제
			case 3 : break;//비디오 수정
			case 4 : break;//비디오 리스트 출력
			case 5 : System.out.println("프로그램을 종료합니다." );break;//비디오 종료 프로그램
			}
			
			
			
			
			
		}while(i<5);
		
		
	}
}

	
	
	
	
	
	


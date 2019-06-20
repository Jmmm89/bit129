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
	//인풋 메소드
	public void Input() {
		
		System.out.println("비디오 제목을 입력하세요.");
		setTitle(scan.next());
		System.out.println("비디오 장르를 입력하세요.");
		setCategory(scan.next());
		System.out.println("비디오 대여여부를 입력하세요.y/n");
		setLend(scan.next());
		if (getLend().equals("y")) {
			System.out.println("대여자 이름을 입력하세요.");
			setLendName(scan.next());
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd EEEE");
			setLendDate(sdf.format(d));
			video.put(getTitle(), "장르 : " + getCategory()+"/ 대여여부 : "+getLend()+"/ 대여자명 : "+getLendName()+"/ 대여일 : "+getLendDate()); List();}
			else if (getLend().equals("n")) {
				video.put(getTitle(), "장르 : " + getCategory());}
		
		
	}
	
	
	//비디오 추가 메소드
		public void addVideo() {
			Input();
			
			List();
			}
			
		
	
		//비디오 리스트 출력 메소드
		
		public void List() {
			Set set = video.entrySet();
			Iterator vit = set.iterator();
			
			while(vit.hasNext()) {
				Map.Entry e = (Map.Entry)vit.next();
				System.out.println("영화 제목  : " + e.getKey() + "\n 영화정보 \n " + e.getValue());
			}
			
			
	
		}
		//비디오 삭제 메소드
		
		public void Vremove() {
			System.out.println("반납이 완료된 영화 제목을 입력하세요. ");
			setTitle(scan.next());
			video.remove(getTitle());
				
			
		}

	//비디오 수정 메소드
		public void Vedit() {
			System.out.println("수정할 영화 제목을 입력하세요. ");
			addVideo();
		}
		
		
	
	
	
}






public class Video2 {

	// title 비디오제목  ㅡ, category 장르 , lend 대여여부
	// lendName 대여자(고객명), lendDate 대여일자(오늘날짜 입력)
	// 비디오추가/삭제/수정/리스트출력/종료 프로그램 작성
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Vmanager2 vm = new Vmanager2();
		int i=0;
		
		do {
			System.out.println("==비디오 대여 관리 프로그램==");
			System.out.println("원하는 기능을 선택하세요 1~5 ");
			System.out.println("1.정보추가 2.정보삭제 3.정보수정 4.리스트출력 5.종료");
			i = scan.nextInt();
			switch(i) {
			case 1 : vm.addVideo();break;//비디오 추가
			case 2 : vm.Vremove();break;//비디오 삭제
			case 3 : vm.Vedit();break;//비디오 수정
			case 4 : vm.List();break;//비디오 리스트 출력
			case 5 : System.out.println("프로그램을 종료합니다." );break;//비디오 종료 프로그램
			}
			
			
			
			
			
		}while(i<5);
		
		
	}
	
	
}

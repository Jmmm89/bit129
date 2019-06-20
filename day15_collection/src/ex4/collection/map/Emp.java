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
	
	public void Input() { // 스캐너로 5개 입력받으세요
		System.out.println("직원정보를 입력하세요.");
		System.out.print("이름 : ");
		setName(scan.next());
		System.out.print("연락처 : ");
		setTel(scan.next());
		System.out.print("부서 : ");
		setPart(scan.next());
		System.out.print("직책 : ");
		setRank(scan.next());
		System.out.print("연봉 : ");
		setPay(scan.next());
		
	
	}

	
	
	//Emp 추가
	void add() { //맵 풋 으로 입력 받으세요 마지막에 리스트 메소드 넣어주세요
		Input();
		sabun++;
		list.add(new String(getName()+getTel()+getPart()+getRank()+getPay()+sabun));
		list();
	}
	
	
	
	//Emp 삭제
	void remove() {
		int i = 0;
		System.out.println("삭제할 직원정보를 선택하세요. ");
		i = scan.nextInt();
		list.remove(i);
		
		//array 삭제
		// list 메소드
		
	}
	
	// Emp 리스트 출력
	void list() {
		// 어레이 전체 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+"번째 데이터 : "+list.get(i));
		}
			
		}
	//list end

		
	
	
	//Emp 수정
	void edit() {
		
		list.add(i,get);
		
	}
	
	// 종료
	
	
	
	
}








public class Emp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		
		
		do {
			
			
			
			
			
			
		}while(true);
		
	}	
	
	
	
}

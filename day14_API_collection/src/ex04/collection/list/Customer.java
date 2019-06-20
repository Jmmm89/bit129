package ex04.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

class Info{
	Scanner scan = new Scanner(System.in);
	String name ,address, tel;
	
	
	
	public Info() {
	
		System.out.println("고객 정보를 입력하세요.");
		System.out.print("이름 : ");
		this.name= scan.next();
		System.out.print("주소 : ");
		this.address = scan.next(); 
		System.out.print("전화번호 : ");
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
	 
	//고객 추가 / 삭제 / 고객 리스트 출력 / 수정 / 프로그램 종료
	//생성자 함수에서 고객정보를 받고  do while문을 이용해서 루틴을 만든다. switch문으로 12345 입력을받아서
	// 각 메소드를 호출한다.
	public Manager() {
		super();
	}
	 
	 public void Cusadd() {
		 
		 list.add(new String(getName()+"/"+getTel()+"/"+getAddress()));
	 }
	 
	 public void Cussub() {  //고객정보 삭제 메소드
		 list.remove(i);
	 }
	 
	 public static void Cusdisp(ArrayList<String> list) { //고객정보 출력 메소드
		 System.out.println("고객정보  : " + list);
	 }

	 public void CusEdit() {
		    int i = scan.nextInt();
//		 list.set(i, setName()+setTel()+setAddress()); 
	 }
	 
 }





public class Customer {

	//생성자 함수, 셋겟 메소드, 아웃풋 메소드
	
	
	
	
	
	
	
}

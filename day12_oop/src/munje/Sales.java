package munje;

import java.util.Scanner;

public class Sales extends Regular{

	private int PI, PIs;
	
	
	public int getPI() {
		return PI;
	}

	public void setPI(int PI) {
		this.PI = PI;
	}

	public Sales(){
		super();
		PI();
		
	}

   public void PI() {
	   
	   
	   //스캐너를 쓸때 pay = 스캔 대신 setPay(new Scanner(System.in).nextInt();)
	   //스캐너를 안쓰고 getPay 대신 super.pay를 쓰는경우라면 겟셋메소드 
	   System.out.print("영업 성공 횟수 입력 : ");
	   PIs = new Scanner(System.in).nextInt();
	   PI = (int)((getPay()*0.05)*PIs);
	  
   }
	
	

	
	
	@Override
	public String toString() {
		return "영업직 [커미션=" + PI + ", 기본급=" + getPay() + ", 사번="
				+ getSaNum() + ", 연락처=" + getpNum() + ", 이름=" + getName() + ", 직급=" + getRank()
				+ "]";
	}
	
	
	

	
	
	
}

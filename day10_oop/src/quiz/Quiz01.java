package quiz;

class Sawn{
	String name, grd, part;
	int pay, call;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrd() {
		return grd;
	}
	public void setGrd(String grd) {
		this.grd = grd;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getCall() {
		return call;
	}
	public void setCall(int call) {
		this.call = call;
	}
	
	public void disp() {
		
		System.out.println("\n*****사원 정보*****\n");
		System.out.println("이름 : " + name + ", 직급 : " + grd);
		System.out.println("부서 : " + part + ", 급여(연봉) : " + pay);
		System.out.println("연락처 : " + call);
	}
	
	
}



public class Quiz01 {

	public static void main(String[] args) {
		Sawn inf = new Sawn();
		inf.setName("JJM");
		inf.setGrd("사원");
		inf.setPart("SI");
		inf.setPay(3000);
		inf.setCall(2005);
		
		inf.disp();
		
		
	}
	
}

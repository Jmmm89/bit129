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
		
		System.out.println("\n*****��� ����*****\n");
		System.out.println("�̸� : " + name + ", ���� : " + grd);
		System.out.println("�μ� : " + part + ", �޿�(����) : " + pay);
		System.out.println("����ó : " + call);
	}
	
	
}



public class Quiz01 {

	public static void main(String[] args) {
		Sawn inf = new Sawn();
		inf.setName("JJM");
		inf.setGrd("���");
		inf.setPart("SI");
		inf.setPay(3000);
		inf.setCall(2005);
		
		inf.disp();
		
		
	}
	
}

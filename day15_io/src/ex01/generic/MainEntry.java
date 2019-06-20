package ex01.generic;

public class MainEntry {
	public static void main(String[] args) {
		
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = {"abc", "kbs", "director"};
		t1.set(str);
		t1.print();
		System.out.println("============================");
		
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] num = {1,2,3,4,5};
		t2.set(num); t2.print();
		
		System.out.println("===========================");
		GenericEx<Double> t3 = new GenericEx<Double>(); //래퍼 클래스만 와야한다. double x Double o
		Double[] dnum = {1.2,3.4,4.5,6.7};
		t3.set(dnum); t3.print();
		
		
		
	}
	
}

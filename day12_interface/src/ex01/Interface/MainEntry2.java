package ex01.Interface;

public class MainEntry2 {

	
	   public static void main(String[] args) {
		BB b = new BB();
		b.draw();
		System.out.println(b.su);
		System.out.println("----------------------");
		
		IDraw bb = new BB();
		bb.draw();
		System.out.println(bb.su);
		
		Tran t = new Bus();
		
		t.Tname("!");
		t.start();
	}
}
// trans를 interface로 구현해서
// bus와 plain class 구현하기
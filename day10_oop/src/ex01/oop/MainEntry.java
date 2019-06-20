package ex01.oop;

class Point {
	
	int x, y; // 멤버변수
	
	public void setX(int xx) {
		
		x = xx;
		
		
	}
	public void setY(int yy) {
		y=yy;
	}
	
	public void disp() {
		System.out.println(x + ", " + y);
	}
	
	
	public int getX() { return x; }
	public int getY() { return y; }
	
//	public void shwo (int a) {
//		System.out.println("aaa");
//		if ( a == 3 ) {
//			return;
//		}
//	}
	
}//Point end


public class MainEntry {

	public static void main(String[] args) {
		
		
		Point pt = new Point(); //객체생성,메모리할당(new), 생성자함수 자동호출
		pt.setX(100);
		pt.setY(200);
		System.out.println(pt.getX() + ", " + pt.getY());
	}
	
	
	
} // MainEntry class end

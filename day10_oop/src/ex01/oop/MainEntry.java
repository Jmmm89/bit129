package ex01.oop;

class Point {
	
	int x, y; // �������
	
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
		
		
		Point pt = new Point(); //��ü����,�޸��Ҵ�(new), �������Լ� �ڵ�ȣ��
		pt.setX(100);
		pt.setY(200);
		System.out.println(pt.getX() + ", " + pt.getY());
	}
	
	
	
} // MainEntry class end

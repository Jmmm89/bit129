package todo01;

public class Rect {

	// x, y, x2, y2 세터게터 메소드를 만들고 생성자 함수 3개 ( 매개변수 1개 2개 4개)
	//생성자3개 셋겟 4변수 출력 
	
	//멤버변수
	private int x,y,x2,y2;

	
	public Rect(int x) {
		
		this.x = x;
	}

	
	public Rect(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public Rect(int x, int y, int x2, int y2) {
		
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
	}

	//세터 게터
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void output () {
		System.out.println(x + ", " + y + ", " + x2 + ", " + y2 );
	}
	
	
}

package todo01;

class Tvfunc{

	int channel;
	String sound, color;
	// 생성자 함수는 멤버변수의 초기화 담당
	public Tvfunc() {
		channel = 7;
		color = "green";
		System.out.println("default constructor call");
	}
	
	public Tvfunc(int channel, String color) {
		this.channel = channel;
		this.color = color;
	}
	
	
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
}


public class Tv {
	
	public static void main(String[] args) {
		
		Tvfunc tvf = new Tvfunc();
		
	}

	public String color(int colornum) {
		
		String color = null;
		
		switch (colornum) {
		case 1 : color = "red"; break;
		case 2 : color = "blue"; break;
		case 3 : color = "green"; break;
		}
		
		
		return color;
	}
	
	public int channel(int chal) {
		
		
		return 0;
	}
	
}


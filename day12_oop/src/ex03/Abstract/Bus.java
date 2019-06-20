package ex03.Abstract;

public class Bus extends TransQ {
	
	
		private String sound;
	@Override
	public String sSound(String sound) {
		
		sound = "부아앙";
		return sound ;
	}

	@Override
	public void process(String name) {
		sSound("부아앙");
		System.out.println( name  + "이" + sound + "출발합니다. ");
	
	
	}
}

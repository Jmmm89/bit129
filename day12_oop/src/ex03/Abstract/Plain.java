package ex03.Abstract;

public class Plain extends TransQ{

	
	private String sound;
	
	@Override
	public String sSound(String sound) {
		sound = "����";
		
		return sound;
	}
	
	
	@Override
	public void process(String name) {
		sSound("����");
		System.out.println( name  + "��" + sound + "����մϴ�. ");

	}
	
	
	
	
	
}

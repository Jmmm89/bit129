package ex03.Abstract;

public class Bicycle extends TransQ {

	
		private String sound;
	@Override
	public String sSound(String sound) {
		sound = "�ؾ�";
		return sound;
	}
	
	@Override
	public void process(String name) {
		sSound("�ؾ�");
		System.out.println( name  + "��" + sound + "����մϴ�. ");

	}

}
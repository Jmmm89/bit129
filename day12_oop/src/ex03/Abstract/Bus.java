package ex03.Abstract;

public class Bus extends TransQ {
	
	
		private String sound;
	@Override
	public String sSound(String sound) {
		
		sound = "�ξƾ�";
		return sound ;
	}

	@Override
	public void process(String name) {
		sSound("�ξƾ�");
		System.out.println( name  + "��" + sound + "����մϴ�. ");
	
	
	}
}

package ex03.Abstract;

public class Subway extends TransQ{

	@Override
	public String sSound(String sound) {
		return sound;
	}
	@Override
	public void process(String name) {
		sSound("ö��ö��");
		System.out.println( name  + "��" + sound + "����մϴ�. ");
		
}

	

	

}

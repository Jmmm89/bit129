package ex03.Abstract;

public class Plain extends TransQ{

	
	private String sound;
	
	@Override
	public String sSound(String sound) {
		sound = "½´¿õ";
		
		return sound;
	}
	
	
	@Override
	public void process(String name) {
		sSound("½´¿õ");
		System.out.println( name  + "ÀÌ" + sound + "Ãâ¹ßÇÕ´Ï´Ù. ");

	}
	
	
	
	
	
}

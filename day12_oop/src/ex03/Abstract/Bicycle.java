package ex03.Abstract;

public class Bicycle extends TransQ {

	
		private String sound;
	@Override
	public String sSound(String sound) {
		sound = "½Ø¾Þ";
		return sound;
	}
	
	@Override
	public void process(String name) {
		sSound("½Ø¾Þ");
		System.out.println( name  + "ÀÌ" + sound + "Ãâ¹ßÇÕ´Ï´Ù. ");

	}

}
package ex01.Interface;

public class Bus implements Tran {

	@Override
	public void start() {
		System.out.println(Tname(name)+"가 출발합니다");

	}

	@Override
	public void stop() {
		System.out.println(Tname(name)+"가 정지합니다");

	}

	@Override
	public String Tname(String name) {
		name = bus;
		return name;
		
	}


	
	
}

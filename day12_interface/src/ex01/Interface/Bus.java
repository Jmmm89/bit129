package ex01.Interface;

public class Bus implements Tran {

	@Override
	public void start() {
		System.out.println(Tname(name)+"�� ����մϴ�");

	}

	@Override
	public void stop() {
		System.out.println(Tname(name)+"�� �����մϴ�");

	}

	@Override
	public String Tname(String name) {
		name = bus;
		return name;
		
	}


	
	
}

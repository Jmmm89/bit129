package ex01.Interface;

public class Plain implements Tran {

	@Override
	public void start() {
		System.out.println(Tname(name)+"�� �̷��մϴ�");

	}

	@Override
	public void stop() {
		System.out.println(Tname(name)+"�� �����մϴ�");

	}

	@Override
	public String Tname(String name) {
		name = plain;
		return name;
	}

}

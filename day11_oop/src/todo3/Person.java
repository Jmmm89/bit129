package todo3;

public class Person {
 //�̸�, Ű, ������
	protected String name;
	protected int tall, weight;
	
	public Person() {
		name = null;
		tall = 0;
		weight= 0;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTall() {
		return tall;
	}
	public void setTall(int tall) {
		this.tall = tall;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [�̸�=" + name + ", Ű=" + tall + ", ������=" + weight + "]";
	}
	
	
	
	
	
}

package ex04.file;
import java.io.*;
import java.util.*;


class Info{
//	����3] �񸸵� ���� ���α׷� �ۼ��ϱ� - collection, file io �̿��ϱ�
//�߰� / ���� / ��� / ����  ó���Ұ� 
//
//������, Ű �� �Է� �޾Ƽ�  BMI ����ϱ�
//BMI = ������ / ( (Ű / 100.0) * (Ű / 100.0) )  ;
//
//�� : (����cm-100) X 0.9
//�� : (����cm-100) X 0.85
//
//���� >
//18.5 �̸�	               ü�ߺ���
//18.5 ~ 22.9	����
//23.0 ~ 24.9	��ü��
//25.0 �̻�
// 					�̸� +������� �� ���Ͽ� �Է�
	
	protected String name, result;
	protected int tall, weight;
	protected double BMI;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
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
	public double getBMI() {
		return BMI;
	}
	public void setBMI(double bMI) {
		BMI = bMI;
	}
	
	

	
	
	
	
}


class Process extends Info {
	
	ArrayList<Object> list = new ArrayList();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int i=0;
	
	//�߰� �޼ҵ� (������ �Է�+���İ� = ��� ����Ʈ�� �߰�)
	
	void add() {
		try {
			
		System.out.println("�񸸵� ������ �Է�");	
		System.out.print("�̸� : ");
		setName(br.readLine()); 
		System.out.print("Ű : ");
		setTall(Integer.parseInt(br.readLine()));  
		System.out.print("������ : ");
		setWeight(Integer.parseInt(br.readLine()));
	
		
	//	BMI = ������ / ( (Ű / 100.0) * (Ű / 100.0) )  ;
		setBMI(getWeight() / ( (getTall() / 100.0) * (getTall() / 100.0) ));
		if(getBMI()<18.5) {
			setResult("ü�ߺ���");
		}else if(18.6<getBMI()&&getBMI()<22.9) {
			setResult("����");
		}else if(23.0<getBMI()&&getBMI()<24.9) {
			setResult("��ü��");
		}else if(25.0<getBMI()) {
			setResult("��");
		}
		list.add(i, "�̸� : "+getName()+"\nŰ"+getTall()+" ������ : "+getWeight()+" BMI : " +getBMI()
		+"\n���� : " +getResult());
		i++;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	void BMIremove() {// ���� �޼ҵ�
		
		System.out.println("������ ������ ��ȣ�� �Է����ּ���.");
		List();
		int index;
		try {
			index = br.read();
			list.remove(index);
			System.out.println(index+"��° ������ ���� �Ϸ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}//remove end
	
	void List() {//����Ʈ ��� �޼ҵ�
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+"��°������\n"+list.get(i));
			System.out.println();
			
		}
		
	
		
	}//List end
	
	
	void made() {
		
		try {
			FileOutputStream fos = null;
			ObjectOutputStream obfos = null;
			//������Ʈ�ƿ�ǲ��Ʈ������ ��̸���Ʈ ��� �����ڵ� Ÿ�� �̽���ġ�� �ѱ�������¾ȵ�
			fos = new FileOutputStream("C:\\Users\\1027\\eclipse-workspace\\day15_io\\BMI.txt");
			obfos = new ObjectOutputStream(fos) ;
			obfos.writeObject(list);
			
//			for (int i = 0; i < list.size(); i++) {   �׽�Ʈ ����
//				obfos.writeObject(list.get(i));	
//			}
				
				
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("������ ���� ����!");
		
	}//made end
	
	void read()throws Exception {
		
		FileInputStream fos = null;
		ObjectInputStream obfos = null;
		//������Ʈ�ƿ�ǲ��Ʈ������ ��̸���Ʈ ��� �����ڵ� Ÿ�� �̽���ġ�� �ѱ�������¾ȵ�
		
		try {
			fos = new FileInputStream("C:\\Users\\1027\\eclipse-workspace\\day15_io\\BMI.txt");
			obfos = new ObjectInputStream(fos) ;
			
			while(true) {
				
			
				
					ArrayList list = (ArrayList)obfos.readObject();
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
				}
					
				
			
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				
		}catch(EOFException f) {
				System.out.println("��� ����.");
			
			
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		obfos.close();
	}
	
}






}



public class BMI {

	public static void main(String[] args) throws Exception {
		

	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Process pro = new Process();
	Scanner scan = new Scanner(System.in);
	int x=0;
	
	try {
		do {
			
		System.out.println("�񸸵� ������ �������α׷�");
		System.out.println("������ ����� ������ �ּ��� 1~4 ");
		System.out.println("1.�������߰� 2.�����ͻ��� 3.��������� 4.�����͹���ȭ 5.�����͹������� 6.����");
		
	try {
		x=Integer.parseInt(br.readLine());
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		switch(x) {
		case 1 : pro.add();break;//�������߰�
		case 2 : pro.BMIremove();break;//�����ͻ���
		case 3 : pro.List();break;//���������
		case 4 : pro.made();break;//���������
		case 5 : pro.read();break;
		case 6 : System.out.println("���α׷��� �����մϴ�.");break;
		default : System.out.println("1~4������ ���ڸ� �Է����ּ���.");
		}
			
		
		
	}while(x<6);} 
//	catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();}
	catch(InputMismatchException e1) {
		System.out.println("���ڸ� �Է����ּ���.");
	}//catch2 end

	
	}//main end
	
	
}

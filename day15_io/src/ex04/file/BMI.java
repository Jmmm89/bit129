package ex04.file;
import java.io.*;
import java.util.*;


class Info{
//	문제3] 비만도 측정 프로그램 작성하기 - collection, file io 이용하기
//추가 / 삭제 / 출력 / 종료  처리할것 
//
//몸무게, 키 를 입력 받아서  BMI 계산하기
//BMI = 몸무게 / ( (키 / 100.0) * (키 / 100.0) )  ;
//
//남 : (신장cm-100) X 0.9
//여 : (신장cm-100) X 0.85
//
//판정 >
//18.5 미만	               체중부족
//18.5 ~ 22.9	정상
//23.0 ~ 24.9	과체중
//25.0 이상
// 					이름 +판정결과 를 파일에 입력
	
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
	
	//추가 메소드 (데이터 입력+계산식값 = 어레이 리스트에 추가)
	
	void add() {
		try {
			
		System.out.println("비만도 데이터 입력");	
		System.out.print("이름 : ");
		setName(br.readLine()); 
		System.out.print("키 : ");
		setTall(Integer.parseInt(br.readLine()));  
		System.out.print("몸무게 : ");
		setWeight(Integer.parseInt(br.readLine()));
	
		
	//	BMI = 몸무게 / ( (키 / 100.0) * (키 / 100.0) )  ;
		setBMI(getWeight() / ( (getTall() / 100.0) * (getTall() / 100.0) ));
		if(getBMI()<18.5) {
			setResult("체중부족");
		}else if(18.6<getBMI()&&getBMI()<22.9) {
			setResult("정상");
		}else if(23.0<getBMI()&&getBMI()<24.9) {
			setResult("과체중");
		}else if(25.0<getBMI()) {
			setResult("비만");
		}
		list.add(i, "이름 : "+getName()+"\n키"+getTall()+" 몸무게 : "+getWeight()+" BMI : " +getBMI()
		+"\n판정 : " +getResult());
		i++;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	void BMIremove() {// 삭제 메소드
		
		System.out.println("삭제할 데이터 번호를 입력해주세요.");
		List();
		int index;
		try {
			index = br.read();
			list.remove(index);
			System.out.println(index+"번째 데이터 삭제 완료.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}//remove end
	
	void List() {//리스트 출력 메소드
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+"번째데이터\n"+list.get(i));
			System.out.println();
			
		}
		
	
		
	}//List end
	
	
	void made() {
		
		try {
			FileOutputStream fos = null;
			ObjectOutputStream obfos = null;
			//오브젝트아웃풋스트림으로 어레이리스트 출력 ※인코딩 타입 미스매치로 한글정상출력안됨
			fos = new FileOutputStream("C:\\Users\\1027\\eclipse-workspace\\day15_io\\BMI.txt");
			obfos = new ObjectOutputStream(fos) ;
			obfos.writeObject(list);
			
//			for (int i = 0; i < list.size(); i++) {   테스트 예정
//				obfos.writeObject(list.get(i));	
//			}
				
				
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("데이터 저장 성공!");
		
	}//made end
	
	void read()throws Exception {
		
		FileInputStream fos = null;
		ObjectInputStream obfos = null;
		//오브젝트아웃풋스트림으로 어레이리스트 출력 ※인코딩 타입 미스매치로 한글정상출력안됨
		
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
				System.out.println("출력 종료.");
			
			
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
			
		System.out.println("비만도 데이터 관리프로그램");
		System.out.println("다음의 기능을 선택해 주세요 1~4 ");
		System.out.println("1.데이터추가 2.데이터삭제 3.데이터출력 4.데이터문서화 5.데이터문서리딩 6.종료");
		
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
		case 1 : pro.add();break;//데이터추가
		case 2 : pro.BMIremove();break;//데이터삭제
		case 3 : pro.List();break;//데이터출력
		case 4 : pro.made();break;//데이터출력
		case 5 : pro.read();break;
		case 6 : System.out.println("프로그램을 종료합니다.");break;
		default : System.out.println("1~4까지의 숫자를 입력해주세요.");
		}
			
		
		
	}while(x<6);} 
//	catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();}
	catch(InputMismatchException e1) {
		System.out.println("숫자를 입력해주세요.");
	}//catch2 end

	
	}//main end
	
	
}

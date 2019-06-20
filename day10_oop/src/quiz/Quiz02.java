package quiz;

import java.util.Scanner;

class Input{
	
	String name;
	int kor, eng, com;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	
}

class Process{
	
	int sum; double avg; char grd;
	
	public char getGrd() {
		return grd;
	}

	public void setGrd(char grd) {
		this.grd = grd;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int sum(int kor, int eng, int com) {
		return kor+eng+com;
}

	public double avg(int sum) {
		return(int)sum/3.0;
	}
	
	
	
	
	
	public char grd(double avg) {
		char grd = ' ';
		
		switch((int)avg/10) {
			case 10 :
			case 9 : grd = 'A'; break;
			case 8 : grd = 'B'; break;
			case 7 : grd = 'C'; break;
			case 6 : grd = 'D'; break;
			default : grd = 'F';
			
			
		}
		return grd;
	}
	
	
}//process end

class output{
	
	String name;
	int kor, eng, com;
	int sum = 0;
	
	public void output() {
		
		
			System.out.println("성적 정보 입력 *****");
			Scanner scan = new Scanner(System.in);
			System.out.print("이름 : ");
			name = scan.nextLine();
			
			System.out.print("국어 : ");
			kor = scan.nextInt();
			
			System.out.print("영어 : ");
			eng = scan.nextInt();
			
			System.out.print("전산 : ");
			com = scan.nextInt();
			System.out.println();
			
				
		Input inf = new Input();
	
		inf.setName(name);
		inf.setKor(kor);
		inf.setEng(eng);
		inf.setCom(com);
		
		Process pro = new Process();
		pro.setSum(pro.sum(inf.getKor(),inf.getEng(),inf.getCom()));
		pro.setAvg(pro.avg(pro.getSum()));
		pro.setGrd(pro.grd(pro.getAvg()));
		
		System.out.println( "***** " +inf.getName()+"의 성적정보*****");
		System.out.println("국어 : " +inf.getKor() + " 영어 " + inf.getEng() + " 전산 " + inf.getCom());
		System.out.println(" 총점 : " + pro.getSum() + " 평균 : " + pro.getAvg() + " 학점 : " + pro.getGrd());
		
				
	}
	
	
}

public class Quiz02 {

	public static void main(String[] args) {
		
		output sungjuk = new output();
		sungjuk.output();
		
	}
	
	
}

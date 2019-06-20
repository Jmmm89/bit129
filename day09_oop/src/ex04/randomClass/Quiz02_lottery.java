package ex04.randomClass;

public class Quiz02_lottery {

	// 문제 2] 로또 프로그램 작성
	// 조건 1~45 숫자 중에서 6개 추출 ( 단, 같은수가 없어야함
	// 중복 체크 위해 
	public static int[] lotto() {
		
		int loddo1;
		int[] loddo = new int [6]; 
		for (int i = 0; i < loddo.length; i++ ) {
			loddo1 = ((int)(Math.random() *6)+1);
			loddo[i]= loddo1;
		}
			
		return loddo;

	}
	
	public static int[] invest(int[]l) {
		 
		
		
		for (int i = 0; i < l.length; i++) { //중복 검사 대상값			
			
			for (int j = 0; j < i; j++) { //중복 검사 비교값
				if (l[i] == l[j]) { // 중복 검사 대상값=비교값
					l[i] = ((int)(Math.random()*6)+1); //중복 검사 대상을 재생성
					i--;                      //재생성한 단부터 중복 검사를 재실행
				
				}
			}
	
		}
		return l;
		
		
	}
		
	
	
	
	public static void main(String[] args) {
		
		int[] l = lotto();
		System.out.print("중복 있는 값 : ");
		for (int i = 0; i < l.length; i++) {
		System.out.print(l[i] + " ");
		}
		System.out.println();
		
		invest(l);
		
		System.out.print("중복 없는 값 : ");
		for (int i = 0; i < l.length; i++) {
			System.out.print(l[i] + " ");	
		}
		
	}
}

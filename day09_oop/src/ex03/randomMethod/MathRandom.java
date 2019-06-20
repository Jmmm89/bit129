package ex03.randomMethod;

public class MathRandom {

	
	public static void main(String[] args) {
		
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		//random() : 난수 발생 0.0 ~ 1.0
		System.out.println();
		System.out.println(Math.random());
	    // 0 ~ n-1 값 출력 원하면 
		System.out.println(Math.random() * 5);
		// 출력값 1~ 5
		System.out.println((Math.random() * 5)+1);
		System.out.println((int)(Math.random() * 10)+1);
		
		//로또 1~45
		System.out.println((Math.random() * 45)+1);//0부터 ~45까지 니까 +1해준다
		 int [] a = new int [5];
		for (int i = 1; i < 7 ; i ++) {
			System.out.print((int)(Math.random() * 45)+1+ " ");//배열사용 동일수 배제, 순서대로 배열
		}
	}
}

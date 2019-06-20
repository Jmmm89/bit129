package ex04.randomClass;

import java.util.Random;

public class RandomClass {

	
	public static void main(String[] args) {
		Random rand = new Random(); // 객체 생성 , 메모리에 할당, 생성자함수 자동호출
		
		System.out.println(rand.nextBoolean()); //data type의 크기만큼 출력한다
		//rand.nextInt(n); = 0~ n-1값을 추출함
		
		System.out.println(rand.nextInt(5)); // 0~4까지
		System.out.println(rand.nextInt(100)+1);
		
		for ( int i = 1; i < 7; i ++) {
			System.out.print(rand.nextInt(45)+1+ " ");
			
			
		}
		System.out.println();
		int ran = random(5);
		System.out.println("메소드 random과 변수 5의 출력값은 = " +ran);
	}
	//답을 난수로 생성 1~100 / 5번 기회중 정답 입력 맞으면 알림+정답출력 
	// 기회 소진하면 오답 알림 +정답출력
	// 정답과 입력답을 비교해서 크면 up 작으면 down 출력
	
	public static int random(int number) {
		Random ran = new Random();
		
		number = ran.nextInt(number);
		
		
		
		return number;
	}
	
	
}

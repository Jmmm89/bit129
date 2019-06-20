package ex04.randomClass;

import java.util.Random;
import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {
	//답을 난수로 생성 1~100 / 5번 기회중 정답 입력 맞으면 알림+정답출력 
		// 기회 소진하면 오답 알림 +정답출력
		// 정답과 입력답을 비교해서 크면 up 작으면 down 출력
	int [] arrcor = new int [1]; // 0(정답) 1 2 3 4 5
	int [] arrscore = new int [5];
	int cor;
	int score;
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	cor = (rand.nextInt(100)+1);
	arrcor[0] = cor;
	for (int i = 0; i < arrscore.length; i++) {
		//정답입력 + 결과출력
		System.out.println("숫자를 입력하세요 : " );
		score = scan.nextInt();
		arrscore[i] = score;
		
		if( arrcor[0] > arrscore[i]) {
			System.out.println("up입니다");
		}
		else if(  arrcor[0] < arrscore[i] ) {
			System.out.println("down입니다");
		}
		else if( arrcor[0] == arrscore[i] ){ 
			System.out.println("정답입니다. 정답은 " + arrcor[0] +" 입니다. ");
		}
	}
		for (int j = 0; j < arrscore.length; j++) {
			if (arrcor[0] != arrscore[j])
			{System.out.println("실패입니다. 정답은 " + arrcor[0] +" 입니다. ");
			break;}
		}
			
	
	
	
}
}

package ex01.returnType;

public class MainEntry {
	
	//함수 만들기
	//1. 함수 정의부 만들고
	//2. 메인함수에서 호출해서 사용함
	
	
public static void main(String[] args) {
	
	int x = 3 , y = 5;
	
	
	
	int result = methodEx1(x,y);
	System.out.println(result);
	int[] arrResult = methodEx2();
	for(int i = 0 ; i < arrResult.length; i++) {
		System.out.println(arrResult[i]+ " ");
}
}

	public static int[] methodEx2() {
		int[] arr = {1,2,3,4,5,6};
		return arr; // 여러개의 데이터 전달은 배열, 객체(object)로 리턴한다.
	}


	public static int methodEx1(int x, int y) {
		// TODO Auto-generated method stub
		return x+y; // 리턴 값은 1개다, 쉼표를 찍을수 없다
	}


	
}



package ex01.operator;

public class Quiz_Ex01 {
    public static void main(String[] args) {
		//1. 변수 선언
    	int pay = 567890;
    	int man, chun, back, sip;
    	int m_na, ch_na, b_na;
    	
       //2. 메세지 출력 및 입력받기
    	//3. 처리(계산)
    	man = pay / 10000;
    	m_na = pay % 10000;
    	
    	chun = m_na/1000;
    	ch_na = m_na % 1000;
    	
    	back = ch_na / 100;
    	b_na = ch_na % 100;
    	
    	sip = b_na / 10;
    	
    	// 4. 결과출력 (화면)
    	
    	System.out.println("\n\n만원 : "+ man + "장\n천원 :" + chun
    			+ "장\n백원 :" + back
    			+ "개\n십원 :" + sip +"개"
    			
    			);
    	
    	System.out.println("=====================");
    	System.out.println("10000원 :" + man);
    	
    	
    	
    
    	
    	
	}
}


     
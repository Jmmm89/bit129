package ex01.operator;

public class Quest1 {
    public static void main(String[] args) {
		/* 문제1] int pay = 567890;
    	result 만원 56장
    	       천원 7장
    	       백원 8개
    	       십원 9개
    	       */
    	
    	int pay = 567890;

    	int man = ( pay /10000 );
    	System.out.println("Result>"+"만원"+man+"장");
    	int chun = ( pay % 10000);
    	System.out.println("\t천원"+(chun/1000)+"장");
    	int beck = ( pay % 1000);
    	System.out.println("\t백원"+(beck/100)+"개");
    	int sip =(pay%100);
    	System.out.println("\t십원"+(sip/10)+"개");
    	
    	
    	
    	
	}
}



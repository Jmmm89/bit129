package ex03.exception;

import java.util.Scanner;

public class Quiz_Ex06 {
public static void main(String[] args) {
	
	//사칙연산 프로그램 작성 (0예외처리하기) if , switch 이용
//	숫자 2개 입력 받고, 연산자 1개 입력 받아서 - + * /
//	result> 3
//	 		5
//	 		+
//	 		
//	 		3 +5 = 8 
	 try {
	    /*	System.out.println(myNum1 / myNum2);*/
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("연산할 숫자를 2개 입력하세요 : ");
	int myNum1, myNum2;
	char ch;
	
	myNum1 = sc.nextInt();
	myNum2 = sc.nextInt();
	
	System.out.println(" 사칙 연산 기호를 입력하세요 : ");
	ch = sc.next().charAt(0);
	
	if ((ch != '+' )&&(ch != '-' )&&(ch != '*' )&&(ch != '/' )) 
		System.out.println(" \n 잘못 입력 하셨습니다." );
		System.exit(0);
	
	
    switch (ch) {
    case '+' : System.out.println( myNum1 +" + " +myNum2 +" = " + (myNum1+myNum2));  break;
    case '-' : System.out.println( myNum1 +" - " +myNum2 +" = " + (myNum1-myNum2));  break;
    case '*' : System.out.println( myNum1 +" * " +myNum2 +" = " + (myNum1*myNum2));  break;
    case '/' : System.out.println( myNum1 +" / " +myNum2 +" = " + (myNum1/myNum2));  break;
    
	
    default : System.out.println( " 잘못 입력하셨습니다. 각 항에 올바른 입력을 해주세요. ");
   
    }
 
  
	 
}
    catch (Exception e) {
    	System.out.println( "0으로 나눌 수 없습니다. ");
    		
    }
        
}
}
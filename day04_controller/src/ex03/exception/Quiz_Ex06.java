package ex03.exception;

import java.util.Scanner;

public class Quiz_Ex06 {
public static void main(String[] args) {
	
	//��Ģ���� ���α׷� �ۼ� (0����ó���ϱ�) if , switch �̿�
//	���� 2�� �Է� �ް�, ������ 1�� �Է� �޾Ƽ� - + * /
//	result> 3
//	 		5
//	 		+
//	 		
//	 		3 +5 = 8 
	 try {
	    /*	System.out.println(myNum1 / myNum2);*/
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("������ ���ڸ� 2�� �Է��ϼ��� : ");
	int myNum1, myNum2;
	char ch;
	
	myNum1 = sc.nextInt();
	myNum2 = sc.nextInt();
	
	System.out.println(" ��Ģ ���� ��ȣ�� �Է��ϼ��� : ");
	ch = sc.next().charAt(0);
	
	if ((ch != '+' )&&(ch != '-' )&&(ch != '*' )&&(ch != '/' )) 
		System.out.println(" \n �߸� �Է� �ϼ̽��ϴ�." );
		System.exit(0);
	
	
    switch (ch) {
    case '+' : System.out.println( myNum1 +" + " +myNum2 +" = " + (myNum1+myNum2));  break;
    case '-' : System.out.println( myNum1 +" - " +myNum2 +" = " + (myNum1-myNum2));  break;
    case '*' : System.out.println( myNum1 +" * " +myNum2 +" = " + (myNum1*myNum2));  break;
    case '/' : System.out.println( myNum1 +" / " +myNum2 +" = " + (myNum1/myNum2));  break;
    
	
    default : System.out.println( " �߸� �Է��ϼ̽��ϴ�. �� �׿� �ùٸ� �Է��� ���ּ���. ");
   
    }
 
  
	 
}
    catch (Exception e) {
    	System.out.println( "0���� ���� �� �����ϴ�. ");
    		
    }
        
}
}
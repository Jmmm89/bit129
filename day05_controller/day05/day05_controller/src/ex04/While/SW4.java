package ex04.While;

import java.util.Scanner;

public class SW4 {
public static void main(String[] args) {
	
	int myNum; //���������� do ~ while �ۿ���
    char grd = ' ';
    
    do {
    	System.out.println("������ �Է��� �ּ��� : ");
    	myNum = new Scanner(System.in).nextInt();
    
    }while(myNum < 0 || myNum > 101 );
    
 		switch (myNum / 10) {
 
 		case 10 :
 		case 9 : grd = 'A'; break;
 		case 8 : grd = 'B'; break;
 		case 7 : grd = 'C'; break;
 		case 6 : grd = 'D'; break;
 		default: grd = 'F'; break;
	
}
	  System.out.println(" ����� ������ " + myNum + "�̰�" + "������ " + "====>" + grd + "�Դϴ�.");
}
}

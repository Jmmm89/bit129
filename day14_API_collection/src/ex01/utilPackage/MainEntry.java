package ex01.utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {

	public static void main(String[] args) {
		Calendar c= Calendar.getInstance(); // �ý����̰����ִ� ��¥����
		System.out.print(c.get(Calendar.YEAR) + "��");
		System.out.print(c.get(Calendar.MONTH)+1 + "��"); // ���� 0���� �����ؼ� ���ϴ´���+1
		System.out.println(c.get(Calendar.DATE) + "��");
		
		
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		
		
		System.out.println("����ð���  " + h + ":" + m + ":"+s);
		
		Calendar c1= Calendar.getInstance();
		Calendar c2= Calendar.getInstance();
		
		c2.set(2018,12,20,0,0);  //�����Ͻú�
		
		if (c1.after(c2)) {
			System.out.println("���� �ð��� 2018�� 1�� 1�� �����Դϴ�.");
		}else if (c1.before(c2)){
			System.out.println("���� �ð��� 2018�� 1�� 1�� �����Դϴ�.");
		}else if (c1.equals(c2)) {
			System.out.println("���� �ð��� 2018�� 1�� 1�� �Դϴ�.");
		}
		
		
	}
	
	
}

package munje;

import java.util.Scanner;

public class Sales extends Regular{

	private int PI, PIs;
	
	
	public int getPI() {
		return PI;
	}

	public void setPI(int PI) {
		this.PI = PI;
	}

	public Sales(){
		super();
		PI();
		
	}

   public void PI() {
	   
	   
	   //��ĳ�ʸ� ���� pay = ��ĵ ��� setPay(new Scanner(System.in).nextInt();)
	   //��ĳ�ʸ� �Ⱦ��� getPay ��� super.pay�� ���°���� �ټ¸޼ҵ� 
	   System.out.print("���� ���� Ƚ�� �Է� : ");
	   PIs = new Scanner(System.in).nextInt();
	   PI = (int)((getPay()*0.05)*PIs);
	  
   }
	
	

	
	
	@Override
	public String toString() {
		return "������ [Ŀ�̼�=" + PI + ", �⺻��=" + getPay() + ", ���="
				+ getSaNum() + ", ����ó=" + getpNum() + ", �̸�=" + getName() + ", ����=" + getRank()
				+ "]";
	}
	
	
	

	
	
	
}

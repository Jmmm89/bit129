package ex03.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class process{
	
	int x, y;
	//���� 2�� �Է¹޾Ƽ� ������ +-*/ ��Ģ����
	
	 public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

	int plus (int x, int y) {
		return x+y;
	}
	
	 int minu (int x, int y) {
			return x-y;
		}
	 
	 int div (int x, int y) {
			return x*y;
		}
	 
	 int mult (int x, int y) {
			return x*y;
		}
	 
	 void Input() throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.print("x���� �Է����ּ��� : ");
		 setX(Integer.parseInt(br.readLine()));
		 System.out.print("y���� �Է����ּ��� : ");
		 setY(Integer.parseInt(br.readLine()));
	 }
	
}




public class Calc {

	
	
	 
	 
	 public static void main(String[] args) throws NumberFormatException, IOException {
	
	process c = new process();
		 
	 System.out.println("****IO ���� ****");
	 System.out.println("�����ϰ��� �ϴ� �μ��� �Է����ּ���.");
	 c.Input();
	 c.plus(c.getX(), c.getY());
	 c.minu(c.getX(), c.getY());
	 try {
	 c.div(c.getX(), c.getY());
	 }catch(ArithmeticException e){
		 e.getMessage(); e.printStackTrace();
	 }
	 c.mult(c.getX(), c.getY());
	 }	 
	 
}


package ex04.randomClass;

public class Lote_ex {

	 public static void main(String[] args) {
		
		 int[] lottocor = new int [6];
			int lottonum;
			
			for (int i = 0; i < lottocor.length; i++) {
				lottonum = ((int)(Math.random()*6)+1);
				for (int j = 0; j < i; j++) {
					
					if (lottocor[i] == lottocor[j]) {
						i--;
					
					}
				}
		
	}
			for (int i = 0; i < lottocor.length; i++) {
				System.out.print(lottocor[i] + " ");
			}
	 }
}

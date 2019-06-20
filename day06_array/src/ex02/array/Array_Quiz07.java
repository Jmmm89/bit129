package ex02.array;

import java.util.Scanner;

public class Array_Quiz07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고자 하는 성적표 갯수 : ");
		int people = sc.nextInt();

		String[] arr = new String[people];
		int[] arrkor = new int[people];
		int[] arreng = new int[people];
		int[] arrcom = new int[people];
		int[] arrsum = new int[people];
		double[] arravg = new double[people]; // 50 60 70   70 60 50
		char[] arrgrd = new char[people];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("name = ");
			arr[i] = sc.next();

			System.out.println("input jumsu(k,e,c) =  ");
			int kor = sc.nextInt();
			arrkor[i] = kor;
			int eng = sc.nextInt();
			arreng[i] = eng;
			int com = sc.nextInt();
			arrcom[i] = com;
			// int total = ( sc.nextInt() + sc.nextInt() + sc.nextInt() );
			arrsum[i] = kor + eng + com;
			double avg = arrsum[i] / 3.0;
			arravg[i] = avg;

			char grd;

			switch ((int) arravg[i] / 10) {
			case 10:
			case 9:
				grd = 'A';
				break;
			case 8:
				grd = 'B';
				break;
			case 7:
				grd = 'C';
				break;
			case 6:
				grd = 'D';
				break;
			default:
				grd = 'F';

			}
			arrgrd[i] = grd;
		}
		for (int i = 0; i < arravg.length; i++) {
			for (int j = i+1; j < arravg.length; j++) {
				
				if(arravg[i] > arravg[j]) {
					double temp = arravg[i];
					arravg[i] = arravg[j];
					arravg[j] = temp;
					
					int temp1 = arrkor[i];
					arrkor[i] = arrkor[j];
					arrkor[j] = temp1;
					
					int temp2 = arreng[i];
					arreng[i] = arreng[j];
					arreng[j] = temp2;
					
					int temp3 = arrcom[i];
					arrcom[i] = arrcom[j];
					arrcom[j] = temp3;
					
					int temp4 = arrsum[i];
					arrsum[i] = arrsum[j];
					arrsum[j] = temp4;
					
					String temp0 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp0;
					
					char temp9 = arrgrd[i];
					arrgrd[i] = arrgrd[j];
					arrgrd[j] = temp9;
					
				}
			
			}
		}
		
		
		
		for (int j = 0; j < arr.length; j++) {
			System.out.println("\n\n name = " + arr[j] + " 국어 :" + arrkor[j] + " 영어 :" + arreng[j] + " 전산 :" + arrcom[j]
					+ "총점 : " + arrsum[j] + " 평균 : " + arravg[j] + "학점 : " + arrgrd[j]);
		}
	}

}

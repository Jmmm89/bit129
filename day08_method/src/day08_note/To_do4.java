package day08_note;

import java.util.Scanner;

public class To_do4 {

	public static String name(String name) {

		name = new Scanner(System.in).nextLine();
		return name;

	}

	public static int kor(int kor) {

		kor = new Scanner(System.in).nextInt();
		return kor;
	}

	public static int eng(int eng) {

		eng = new Scanner(System.in).nextInt();
		return eng;
	}

	public static int com(int com) {

		com = new Scanner(System.in).nextInt();
		return com;

	}

	public static int total(int kor, int eng, int com) {

		int total = kor + eng + com;
		return total;
	}

	public static double avg(int kor, int eng, int com) {
		double avg = (kor + eng + com) / 3.0;

		return avg;
	}

	public static char grade(double avg) {

		char grade = ' ';
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		return grade;
	}

	public static void main(String[] args) {

		String name;
		int sum, kor, eng, com;
		double avg;
		char grd;

		System.out.print("이름입력 : ");
		name = name(null);
		System.out.print("국어점수 : ");
		kor = kor(0);
		System.out.print("영어점수 : ");
		eng = eng(0);
		System.out.print("전산점수 : ");
		com = com(0);
		sum = total(kor, eng, com);
		avg = avg(kor, eng, com);
		grd = grade(avg);
		System.out.println("===성적표===");
		System.out.println("이름 " + name);
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.println("총점 " + sum + " 평균 " + avg + " 학점 " + grd);

	}
}

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

		System.out.print("�̸��Է� : ");
		name = name(null);
		System.out.print("�������� : ");
		kor = kor(0);
		System.out.print("�������� : ");
		eng = eng(0);
		System.out.print("�������� : ");
		com = com(0);
		sum = total(kor, eng, com);
		avg = avg(kor, eng, com);
		grd = grade(avg);
		System.out.println("===����ǥ===");
		System.out.println("�̸� " + name);
		System.out.println("���� : " + kor + " ���� : " + eng + " ���� : " + com);
		System.out.println("���� " + sum + " ��� " + avg + " ���� " + grd);

	}
}

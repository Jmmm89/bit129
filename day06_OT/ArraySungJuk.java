/*
package quiz;

import java.util.Scanner;

public class ArraySungJuk {
	public static void main(String[] args) {
		// ����, ����, ��������
			   int NUM = 3;
				Scanner sc = new Scanner(System.in);		
				int[] kor = new int[NUM];
				int[] mat = new int[NUM];
				int[] com = new int[NUM];	
				int sum=0, count = 0;
				float avg=0;
				char ch=0;
				
				for(int i=0; i < NUM; i++){
					System.out.println();
					System.out.println((i+1)+"�� �л��� ������ �Է��ϼ���.");
					System.out.print("���� >> ");					kor[i] = sc.nextInt();
					System.out.print("���� >> ");					mat[i] = sc.nextInt();
					System.out.print("���� >> ");					com[i] = sc.nextInt();
					count++;
				}
				
				System.out.println("\n\n*-*-*-*-*-* ����ǥ *-*-*-*-*-*");
				System.out.println("�л�\t����\t����\t����\t����\t���\t����");
				for(int i=0; i<NUM; i++){
					sum = kor[i]+mat[i]+com[i];
					avg = (float)sum / count;
					switch((int)avg/10){
					case 9:	ch = 'A';	break;
					case 8:	ch = 'B';		break;
					case 7:	ch = 'C';		break;
					case 6:	ch = 'D';	break;
					default:	ch = 'F';
					}// switch
					
				System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t  %c\n", (i+1), kor[i], mat[i], com[i], sum, avg, ch );		// ���� �߰��ؾ���
				}
		}
}
//*/

/*
package quiz;

import java.util.Scanner;

public class ArraySungJuk {
	public static void main(String[] args) {
		// ����5] 7���� �����͸� �޾� ����/���/���� ���ϴ� P/G (1�� �� �� ����)
		int x=2;
		int[][] a = new int[x][3];  //�ο���, �����
		int i, j, sum = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < x; i++) {  //for (i = 0; i <= x-1; i++) {
			System.out.println((i + 1) + "�� �л��� �� ������ �Է��Ͻÿ�");
			for (j = 0; j <= 2; j++) {
				do {
					switch (j) {
					case 0:
						System.out.print("�������� : ");
						a[i][j] = sc.nextInt();
						break;
					case 1:
						System.out.print("�������� : ");
						a[i][j] = sc.nextInt();
						break;
					case 2:
						System.out.print("�������� : ");
						a[i][j] = sc.nextInt();
						break;
					}
					if (a[i][j] < 0 || a[i][j] > 100)
						System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ� �Է��ϼ���");
				} while (a[i][j] < 0 || a[i][j] > 100);
			}
		}
		for (i = 0; i <= x-1; i++) {
			System.out.println((i + 1) + "�� �л��� ������ ���� ");
			for (j = 0; j <= 2; j++) {
				switch (j) {
				case 0:
					System.out.print("����" + a[i][j]);
					break;
				case 1:
					System.out.print("����" + a[i][j]);
					break;
				case 2:
					System.out.print("����" + a[i][j]);
					break;
				}
				sum += a[i][j];
			}
			System.out.println("�̸� ������ " + sum + " �̰� ����� " + (double) sum / 3 + "�̸�\n ������ ");
			if ((double) sum / 3 >= 90) {
				System.out.println(" A �Դϴ�.");

			} else if ((double) sum / 3 >= 80) {
				System.out.println(" B �Դϴ�."); sum=0;
			} else if ((double) sum / 3 >= 70) {
				System.out.println(" C �Դϴ�.");sum=0;
			} else if ((double) sum / 3 >= 60) {
				System.out.println(" D �Դϴ�.");sum=0;
			} else
				System.out.println(" F �Դϴ�.");sum=0;

		}
		}
}
//*/



/*
package quiz;

import java.util.Scanner;

public class ArraySungJuk {
	public static void main(String[] args) {
		// ����5] 7���� �����͸� �޾� ����/���/���� ���ϴ� P/G (1�� �� �� ����)

				Scanner scan = new Scanner(System.in);

				int student = 2;
				int[] kor = new int[student];		int[] eng = new int[student];
				int[] mat = new int[student];		int[] sum = new int[student];
				char[] res = new char[student];
				double[] avg = new double[student];

				for (int i = 0; i < student; i++) {
					do {
						System.out.print((i + 1) + "��° �л��� ���� ������ �Է��ϼ��� : ");
						kor[i] = scan.nextInt();
					} while (kor[i] < 0 || kor[i] > 100);
					do {
						System.out.print((i + 1) + "��° �л��� ���� ������ �Է��ϼ��� : ");
						eng[i] = scan.nextInt();
					} while (eng[i] < 0 || eng[i] > 100);
					do {
						System.out.print((i + 1) + "��° �л��� ���� ������ �Է��ϼ��� : ");
						mat[i] = scan.nextInt();
					} while (mat[i] < 0 || mat[i] > 100);

					sum[i] = kor[i] + eng[i] + mat[i];
					avg[i] = sum[i] / 3.0;

					System.out.println();
				}

				System.out.println();

				for (int i = 0; i < student; i++) {
					if (avg[i] >= 90.0 && avg[i] <= 100.0)
						res[i] = 'A';
					else if (avg[i] >= 80.0 && avg[i] < 90.0)
						res[i] = 'B';
					else if (avg[i] >= 70.0 && avg[i] < 80.0)
						res[i] = 'C';
					else if (avg[i] >= 60.0 && avg[i] < 70.0)
						res[i] = 'D';
					else
						res[i] = 'F';

					System.out.printf("%d��° �л��� ������ %d���̰�, ����� %.2f���̸�, ������ %c�Դϴ�.\n", (i + 1), sum[i], avg[i], res[i]);
				}
			}
}
//*/


//*
package quiz;

import java.util.Scanner;

public class ArraySungJuk {
	public static void main(String[] args) {
		int SU = 2;
		Scanner sc = new Scanner(System.in);
		int[] kor = new int[SU];
		int[] eng = new int[SU];
		int[] mat = new int[SU];

		System.out.print("�� �л��� ���� ������ �Է��Ͻÿ�:");

		for (int i = 0; i < kor.length; i++) {
			kor[i] = sc.nextInt();
		}

		System.out.print("�� �л��� ���� ������ �Է��Ͻÿ�:");

		for (int i = 0; i < eng.length; i++) {
			eng[i] = sc.nextInt();
		}

		System.out.print("�� �л��� ���� ������ �Է��Ͻÿ�:");

		for (int i = 0; i < mat.length; i++) {
			mat[i] = sc.nextInt();
		}

		int[] sum = new int[SU];
		int[] arg = new int[SU];
		char[] score = new char[SU];

		for (int i = 0; i < sum.length; i++) {

			sum[i] = kor[i] + eng[i] + mat[i];
			arg[i] = sum[i] / 3;

			if (90 <= arg[i] && arg[i] <= 100) {
				score[i] = 'A';
			} else if (80 <= arg[i] && arg[i] < 90) {
				score[i] = 'B';
			} else if (70 <= arg[i] && arg[i] < 80) {
				score[i] = 'C';
			} else if (60 <= arg[i] && arg[i] < 70) {
				score[i] = 'D';
			} else {
				score[i] = 'F';
			}
			System.out.println((i + 1) + "��° �л� ����:" + sum[i] + "  ���" + arg[i] + "  ����" + score[i]);

		}
		System.out.println();
	}
}
//*/
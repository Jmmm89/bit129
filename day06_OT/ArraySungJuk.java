/*
package quiz;

import java.util.Scanner;

public class ArraySungJuk {
	public static void main(String[] args) {
		// 국어, 수학, 전산점수
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
					System.out.println((i+1)+"번 학생의 성적을 입력하세요.");
					System.out.print("국어 >> ");					kor[i] = sc.nextInt();
					System.out.print("수학 >> ");					mat[i] = sc.nextInt();
					System.out.print("전산 >> ");					com[i] = sc.nextInt();
					count++;
				}
				
				System.out.println("\n\n*-*-*-*-*-* 성적표 *-*-*-*-*-*");
				System.out.println("학생\t국어\t수학\t전산\t총점\t평균\t학점");
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
					
				System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t  %c\n", (i+1), kor[i], mat[i], com[i], sum, avg, ch );		// 학점 추가해야함
				}
		}
}
//*/

/*
package quiz;

import java.util.Scanner;

public class ArraySungJuk {
	public static void main(String[] args) {
		// 문제5] 7명의 데이터를 받아 총점/평균/학점 구하는 P/G (1명 당 세 과목)
		int x=2;
		int[][] a = new int[x][3];  //인원수, 과목수
		int i, j, sum = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < x; i++) {  //for (i = 0; i <= x-1; i++) {
			System.out.println((i + 1) + "번 학생의 각 점수를 입력하시오");
			for (j = 0; j <= 2; j++) {
				do {
					switch (j) {
					case 0:
						System.out.print("국어점수 : ");
						a[i][j] = sc.nextInt();
						break;
					case 1:
						System.out.print("영어점수 : ");
						a[i][j] = sc.nextInt();
						break;
					case 2:
						System.out.print("수학점수 : ");
						a[i][j] = sc.nextInt();
						break;
					}
					if (a[i][j] < 0 || a[i][j] > 100)
						System.out.println("잘못 입력하셨습니다 다시 입력하세요");
				} while (a[i][j] < 0 || a[i][j] > 100);
			}
		}
		for (i = 0; i <= x-1; i++) {
			System.out.println((i + 1) + "번 학생의 점수는 각각 ");
			for (j = 0; j <= 2; j++) {
				switch (j) {
				case 0:
					System.out.print("국어" + a[i][j]);
					break;
				case 1:
					System.out.print("영어" + a[i][j]);
					break;
				case 2:
					System.out.print("수학" + a[i][j]);
					break;
				}
				sum += a[i][j];
			}
			System.out.println("이며 총점은 " + sum + " 이고 평균은 " + (double) sum / 3 + "이며\n 학점은 ");
			if ((double) sum / 3 >= 90) {
				System.out.println(" A 입니다.");

			} else if ((double) sum / 3 >= 80) {
				System.out.println(" B 입니다."); sum=0;
			} else if ((double) sum / 3 >= 70) {
				System.out.println(" C 입니다.");sum=0;
			} else if ((double) sum / 3 >= 60) {
				System.out.println(" D 입니다.");sum=0;
			} else
				System.out.println(" F 입니다.");sum=0;

		}
		}
}
//*/



/*
package quiz;

import java.util.Scanner;

public class ArraySungJuk {
	public static void main(String[] args) {
		// 문제5] 7명의 데이터를 받아 총점/평균/학점 구하는 P/G (1명 당 세 과목)

				Scanner scan = new Scanner(System.in);

				int student = 2;
				int[] kor = new int[student];		int[] eng = new int[student];
				int[] mat = new int[student];		int[] sum = new int[student];
				char[] res = new char[student];
				double[] avg = new double[student];

				for (int i = 0; i < student; i++) {
					do {
						System.out.print((i + 1) + "번째 학생의 국어 점수를 입력하세요 : ");
						kor[i] = scan.nextInt();
					} while (kor[i] < 0 || kor[i] > 100);
					do {
						System.out.print((i + 1) + "번째 학생의 영어 점수를 입력하세요 : ");
						eng[i] = scan.nextInt();
					} while (eng[i] < 0 || eng[i] > 100);
					do {
						System.out.print((i + 1) + "번째 학생의 수학 점수를 입력하세요 : ");
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

					System.out.printf("%d번째 학생의 총점은 %d점이고, 평균은 %.2f점이며, 학점은 %c입니다.\n", (i + 1), sum[i], avg[i], res[i]);
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

		System.out.print("각 학생의 국어 점수를 입력하시오:");

		for (int i = 0; i < kor.length; i++) {
			kor[i] = sc.nextInt();
		}

		System.out.print("각 학생의 영어 점수를 입력하시오:");

		for (int i = 0; i < eng.length; i++) {
			eng[i] = sc.nextInt();
		}

		System.out.print("각 학생의 수학 점수를 입력하시오:");

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
			System.out.println((i + 1) + "번째 학생 총점:" + sum[i] + "  평균" + arg[i] + "  학점" + score[i]);

		}
		System.out.println();
	}
}
//*/

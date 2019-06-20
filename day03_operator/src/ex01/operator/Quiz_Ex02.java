package ex01.operator;

public class Quiz_Ex02 {
	public static void main(String[] args) {
//	문제2] int su = 123456;
		// 시 : 분 : 초
		int cho, si, bun;
		int si_2, bun_2;
		cho = 123456;
		si = cho / 3600;
		si_2 = cho % 3600;
		bun = si_2 / 60;
		bun_2 = cho % 60;

		System.out.println(si + "시:" + bun + "분:" + bun_2 + "초");
	}
}

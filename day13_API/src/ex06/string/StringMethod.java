package ex06.string;

public class StringMethod {
	public static void main(String[] args) {
		
		String s1 = "happytrumph";
		String s2 = "D.C";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println(s2.replace("C", "D"));
		System.out.println(s2.hashCode());
		System.out.println(s2);
		
		System.out.println("������ȯ====================");
		s2 = s2.replace("C", "D");
		System.out.println(s2.hashCode());
		System.out.println(s2);
		System.out.println("============================");
		s1 = s1.concat(s2); // concat �ι��ڸ� ���ս�Ų��
//		s1 = s1 +s2;
		
		System.out.println(s1);
		System.out.println("============================");
		String s3 = new String("      ab     cd         ");
		System.out.println(s3.length()); // ���ڿ� ����  length 24
		s3 = s3.trim(); // �������� �޼ҵ�
		System.out.println(s3.length()); // ���ڿ� ���� 9, ���� ���۰� �� ������ ������ ���Ű� �ȵ�
		System.out.println(s3);
		
//		String s4 = new String ( "ab/defgh/3213463/wqeqwe/124313");
		String s4 = new String ( "ab defgh 3213463 wqeqwe 124313");
		String[] s5 = s4.split(" ");//�Ű����� �Է°��� �������� ����
		for (int i = 0; i < s5.length; i++) {
			System.out.println("�и���" + i + " �� ���ڿ�  : " + s5[i]);
		
			System.out.println("============================");
			String s6 = "123-4567-7896";
			String[] s7 = s6.split("-");
			for (int j = 0; j < s7.length; j++) {
				System.out.println(s7[j]);
			}
			
			
		System.out.println("==============================");
		String s8 = "120398210938190238       109283120938     102938120398  string";
		char ch = s8.charAt(10);
		System.out.println(ch);
		
		s8 = s8.substring(4); // ���ڰ� 1���� ������ġ���� �� ������ ���
		System.out.println(s8); 
		
		s8 = s8.substring(5,7); //  5~6����
		System.out.println(s8);
		System.out.println("++++++++++++++++++++++++++++");	
		
		System.out.println("�ҹ��ڷ� ��� toLowerCase() : " + s2.toLowerCase());
		System.out.println("�빮�ڷ� ��� toUpperCase() : " + s2.toUpperCase());
		System.out.println(s2);
		
		System.out.println(s1.length());
		char[] ch2 = s1.toCharArray();
		
		for (int j = 0; j < s1.length(); j++) {
			System.out.print(ch2[i]+ " ");
		}
		
		}
		
	}
}

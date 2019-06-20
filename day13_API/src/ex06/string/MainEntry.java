package ex06.string;

public class MainEntry {
	public static void main(String[] args) {
		int x = 999;
		String str = "abc";
		System.out.println("str : " + str);
		
		char[] data = { 'k', 'b', 's'};
		str = new String(data);
		System.out.println("str 2 : " + str);
		System.out.println("kbs");
		
		String msg = "cdefghif";
		System.out.println("korea " + msg);
		System.out.println(msg);
		
		msg = msg.concat("korea"); // 문자열 결합
		System.out.println(msg);
		
		String str2 = "abcedf".substring(2); // 문자시작위치 지정 0부터 시작
		System.out.println(str2); //cedf
		
		str2 =  "abcdefg1891287101135".substring(2, 5); // 시작값은 포함하지만 끝값은 미포함 된다 endindex-1. 왜굳이 이렇게 했을까?
		System.out.println(str2);
		
		System.out.println(msg + " : " + str2);
	}
	
	
}

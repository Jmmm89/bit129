package ex03.IO;
import java.io.*;
public class BufferedReaderEx1 {
	
	
	public static void main(String[] args) throws IOException {
		
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(System.in); //매개변수자리에 직접 System.in을 넣어도된다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("character input : ");
		String str = br.readLine(); //예외발생 트라이캐치로 직접처리하거나 스로우로 위임한다
		
		System.out.println(str);
		
	}
}

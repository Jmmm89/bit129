package ex03.IO;
import java.io.*;
public class BufferedReaderEx2 {
	
	
	public static void main(String[] args) throws IOException {
		
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(System.in); //매개변수자리에 직접 System.in을 넣어도된다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("input : ");
//		String str1 = br.readLine(); //예외발생 트라이캐치로 직접처리하거나 스로우로 위임한다
//		System.out.println("input : ");
//		String str2 = br.readLine(); 
//		
//		int su1 = Integer.parseInt(str1);
//		int su2 = Integer.parseInt(str2);
//		
		System.out.println("input : ");
		int su1 = Integer.parseInt(br.readLine());
		System.out.println("input : ");
		int su2 = Integer.parseInt(br.readLine());
		
		System.out.println(su1 + su2);
		
	}
}

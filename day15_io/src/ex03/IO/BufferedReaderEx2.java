package ex03.IO;
import java.io.*;
public class BufferedReaderEx2 {
	
	
	public static void main(String[] args) throws IOException {
		
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(System.in); //�Ű������ڸ��� ���� System.in�� �־�ȴ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("input : ");
//		String str1 = br.readLine(); //���ܹ߻� Ʈ����ĳġ�� ����ó���ϰų� ���ο�� �����Ѵ�
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

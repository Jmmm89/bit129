package ex03.IO;
import java.io.*;
public class BufferedReaderEx1 {
	
	
	public static void main(String[] args) throws IOException {
		
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(System.in); //�Ű������ڸ��� ���� System.in�� �־�ȴ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("character input : ");
		String str = br.readLine(); //���ܹ߻� Ʈ����ĳġ�� ����ó���ϰų� ���ο�� �����Ѵ�
		
		System.out.println(str);
		
	}
}

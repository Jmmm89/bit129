package ex01.file;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class FileWriterEx {

		public static void main(String[] args) throws IOException {
			
			String str, file;
			Date d = new Date();
			str = "파일 생성 시간 \r\n" + d + "\r\n";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("파일 이름 입력 요망  : ");
			file = br.readLine();
			System.out.println("저장할 문자열 입력 하세요.");
			str += br.readLine();
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(str);
			bw.close();
			System.out.println(file + "파일을 성공적으로 저장 했습니다. ");
			
		}
}

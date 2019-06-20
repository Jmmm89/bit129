package ex04.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) {
		 //파일을 찾을수 없는 예외를 처리해준다 (위임 혹은 직접)
		Scanner scan = new Scanner(System.in);
		try {
			FileOutputStream os = new FileOutputStream("C:\\Users\\1027\\test.txt"); //절대경로
			//FileOutputStream os = new FileOutputStream("test.txt"); 상대경로
			while(true) {
				System.out.println("문자열 입력 요망 : ");
				String str = scan.nextLine() + "\r\n";
				
				if ( str.toUpperCase().equals("EXIT\r\n")) break;
				
				os.write(str.getBytes()); //데이터를 파일에 써주는부분
				System.out.println(str); //입력받은 데이터를 그대로 출력
				
				System.out.println("데이터 저장 성공!");
			}
			
			
			
		} catch (FileNotFoundException e) {
		} catch (Exception e1) {
		}
	}
}

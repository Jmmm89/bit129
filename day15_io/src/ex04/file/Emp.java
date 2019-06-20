package ex04.file;
import java.io.*;
import java.util.*;
public class Emp {
	 //파일을 찾을수 없는 예외를 처리해준다 (위임 혹은 직접)
//	Scanner scan = new Scanner(System.in);
//	try {
//		FileOutputStream os = new FileOutputStream("C:\\Users\\1027\\test.txt"); //절대경로
//		//FileOutputStream os = new FileOutputStream("test.txt"); 상대경로
//		while(true) {
//			System.out.println("문자열 입력 요망 : ");
//			String str = scan.nextLine() + "\r\n";
//			
//			if ( str.toUpperCase().equals("EXIT\r\n")) break;
//			
//			os.write(str.getBytes()); //데이터를 파일에 써주는부분
//			System.out.println(str); //입력받은 데이터를 그대로 출력
//			
//			System.out.println("데이터 저장 성공!");
//		}
//		
//		
//		
//	} catch (FileNotFoundException e) {
//	} catch (Exception e1) {
//	}
//}
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\1027\\Emp.txt");
			while(true) {
				
				System.out.println("사원 정보 입력");
				System.out.print("이름 : ");
				String name = "이름 : "+br.readLine()+"\r\n";
				System.out.println(name);
				System.out.print("직급 : ");
				String rank = "직급 : "+br.readLine()+"\r\n";
				System.out.println(rank);
				System.out.print("부서 : ");
				String part = "부서 : "+br.readLine()+"\r\n";
				System.out.println(part);
				
				file.write(name.getBytes());
				file.write(rank.getBytes());
				file.write(part.getBytes());
				
				System.out.println("정보 저장 성공!");
				String Exit = br.readLine();
				if ( Exit.toUpperCase().equals("EXIT\r\n")) break;
			}
			
			
		} catch (FileNotFoundException e) {
			e.getMessage();
			e.printStackTrace();
		}catch(IOException e1) {
			e1.getMessage();
			e1.printStackTrace();
		}
	}
	
}

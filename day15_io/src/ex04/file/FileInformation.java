package ex04.file;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FileInformation {

	public static void main(String[] args) throws IOException { //예외처리 위임
		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		System.out.print("file name = "); // 상대경로 - test. txt
		
		System.in.read(fileName); // 리드 메소드는 예외가 발생하기 때문에 익셉션 처리가 필수적이다
		strName = new String(fileName).trim(); //위에서 읽어낸 파일 이름 받아옴
		
		file = new File(strName);
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd EEEE");
		System.out.println("절대경로 : " + file.getAbsolutePath());
		System.out.println("표준경로 : " + file.getCanonicalPath());
		System.out.println("최종 수정일 : " + sdf.format((file.lastModified())));
		System.out.println("파일크기 : " + file.length());
		System.out.println("읽기 속성 : " + file.canRead());
		System.out.println("쓰기속성 : " + file.canWrite());
		System.out.println("파일속성 : " + file.getPath());
		System.out.println("숨김속성 : " + file.isHidden());
		
			
	}
	
}

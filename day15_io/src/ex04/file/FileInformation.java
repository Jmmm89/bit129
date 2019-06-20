package ex04.file;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FileInformation {

	public static void main(String[] args) throws IOException { //����ó�� ����
		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		System.out.print("file name = "); // ����� - test. txt
		
		System.in.read(fileName); // ���� �޼ҵ�� ���ܰ� �߻��ϱ� ������ �ͼ��� ó���� �ʼ����̴�
		strName = new String(fileName).trim(); //������ �о ���� �̸� �޾ƿ�
		
		file = new File(strName);
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd EEEE");
		System.out.println("������ : " + file.getAbsolutePath());
		System.out.println("ǥ�ذ�� : " + file.getCanonicalPath());
		System.out.println("���� ������ : " + sdf.format((file.lastModified())));
		System.out.println("����ũ�� : " + file.length());
		System.out.println("�б� �Ӽ� : " + file.canRead());
		System.out.println("����Ӽ� : " + file.canWrite());
		System.out.println("���ϼӼ� : " + file.getPath());
		System.out.println("����Ӽ� : " + file.isHidden());
		
			
	}
	
}

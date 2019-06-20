package ex06.io;
import java.io.*;

public class DataOutputStreamEx {

	public static void main(String[] args) throws Exception {
		
		File file = new File("Info.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65); // 'A'
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeLong(888000);
		dos.writeFloat(8.8f);
		dos.writeDouble(12.345670);
		dos.flush();
		
		System.out.println("text.txt ÆÄÀÏ¿¡" + dos.size()+ "byte save");
		
		dos.close();
		
		
	}
}

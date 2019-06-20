package ex01.net;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
public class URLEx2 {
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		URL url = new URL("https://www.google.com/search?ei=wFMDXcTYFOmFr7wP-r-D4AM&q=kim+yuna&oq=kim+y&gs_l=psy-ab.3.0.0l10.20412.21358..22860...0.0..0.206.686.0j4j1......0....1..gws-wiz.......0i131j0i67.crcaedC_jVM");
		System.out.println("�������� : " + url.getProtocol());
		System.out.println("ȣ��Ʈ�� ��Ʈ : " + url.getAuthority());
		System.out.println("ȣ��Ʈ : " + url.getHost());
		System.out.println("��Ʈ : " + url.getPort());
		System.out.println("��� : " + url.getPath());
		System.out.println("���� : " + url.getQuery());
		System.out.println("���ϸ� : " + url.getFile());
		System.out.println("���� : " + url.getRef());
		
		
		
	}

}

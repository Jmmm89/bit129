package ex01.net;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
public class URLEx {
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		URL google = new URL("http://www.google.com");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));
		
		String inputLine;
		
		while((inputLine = br.readLine())!= null) { //null이 리턴됨 , 예외발생 IOExcep
			System.out.println(inputLine);
		}
		
	}

}

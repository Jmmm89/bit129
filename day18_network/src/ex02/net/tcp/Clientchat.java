package ex02.net.tcp;



import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;
 
public class Clientchat {
//server socket 1개
    public static void main(String[] args) throws IOException {
    	 Scanner scan = new Scanner(System.in);
    	String serverip="10.10.10.168";
        int port=7000;
        
        Date date = null;
        ObjectInputStream ois = null ;
        InputStream is;
        Socket client;
        
        try {
            client = new Socket(serverip,port);
            is = client.getInputStream();
            ois = new ObjectInputStream(is);
            ObjectOutputStream oos = null;
            OutputStream os;
             os = client.getOutputStream();// net 통해서 가져옴
            oos = new ObjectOutputStream(os);
            System.out.println("server측 날짜시간확인...여기클라이언트입니다.\n\n");
            
//            date = (Date) ois.readObject();
//            
//            System.out.println("현재시간 : "+date+"입니다.");
            
            while(true) {
            String tmp = (String) ois.readObject();
            System.out.println(tmp);
            System.out.print("서버 : ");
            
            
            oos.writeObject(scan.next());// 서버측 날짜를....
            
            }
//            ois.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            ois.close();
        }
    }
}

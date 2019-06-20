package ex02.net.tcp;
 
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
 
public class Serverchat {
    // server socket2개
    public static void main(String[] args) throws IOException {
        int port = 7000; // 0~1024예약됨
 
        ObjectOutputStream oos = null;
        OutputStream os;
        ObjectInputStream ois = null ;
        InputStream is;
        Socket s = null;
        try {
            System.out.println("server start");
            ServerSocket ss = new ServerSocket(port);// socket1개생성
            Scanner scan = new Scanner(System.in);
            
            s= ss.accept();// socket2
            is = s.getInputStream();
            ois = new ObjectInputStream(is);
             os = s.getOutputStream();// net 통해서 가져옴
            oos = new ObjectOutputStream(os);
//        
            while (true) {
            	 String tmp = (String) ois.readObject();
                 System.out.println(tmp);
                 
            	
//                oos.writeObject(new Date());// 서버측 날짜를....
                System.out.println("입력해주세요");
                
                oos.writeObject(scan.next());// 서버측 날짜를....
                System.out.println("1");
                
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }finally {
            oos.flush();
            s.close();
        }
 
    }
}
 

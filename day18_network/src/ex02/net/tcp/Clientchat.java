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
//server socket 1��
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
             os = client.getOutputStream();// net ���ؼ� ������
            oos = new ObjectOutputStream(os);
            System.out.println("server�� ��¥�ð�Ȯ��...����Ŭ���̾�Ʈ�Դϴ�.\n\n");
            
//            date = (Date) ois.readObject();
//            
//            System.out.println("����ð� : "+date+"�Դϴ�.");
            
            while(true) {
            String tmp = (String) ois.readObject();
            System.out.println(tmp);
            System.out.print("���� : ");
            
            
            oos.writeObject(scan.next());// ������ ��¥��....
            
            }
//            ois.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            ois.close();
        }
    }
}

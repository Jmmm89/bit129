package ex01.operator;

public class Quest1 {
    public static void main(String[] args) {
		/* ����1] int pay = 567890;
    	result ���� 56��
    	       õ�� 7��
    	       ��� 8��
    	       �ʿ� 9��
    	       */
    	
    	int pay = 567890;

    	int man = ( pay /10000 );
    	System.out.println("Result>"+"����"+man+"��");
    	int chun = ( pay % 10000);
    	System.out.println("\tõ��"+(chun/1000)+"��");
    	int beck = ( pay % 1000);
    	System.out.println("\t���"+(beck/100)+"��");
    	int sip =(pay%100);
    	System.out.println("\t�ʿ�"+(sip/10)+"��");
    	
    	
    	
    	
	}
}


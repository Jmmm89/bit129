package quiz;

// ������ �̿��ؼ� ������ ����ϱ� 

public class GuguThread extends Thread{

	String name;
	
	public GuguThread(String name) {
		this.name=name;
	}
	
	
	
	@Override
	public void run() {
	
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
				if(j==9) {
					try {
						sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		}
		
		
		
	}
	
	

}

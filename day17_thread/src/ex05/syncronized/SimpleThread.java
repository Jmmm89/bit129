package ex05.syncronized;


public class SimpleThread {

	static void threadMessage(String message) { //스레드 메세지부분
		String threadName = Thread.currentThread().getName(); // 스레드네임 
		System.out.printf("%s : %s\n\n", threadName, message);
		
	}
	
	
	static class MessageLoop implements Runnable{ //inner class

		@Override
		public void run() { //스레드 실행부(구현부)
			String[] importantInfo = {"aa aa", "bb b", "cc c", "dd d"};
			
			try {
				for(int i = 0; i < importantInfo.length; i++) {//배열의 길이만큼 반복
					Thread.sleep(4000);//4초
					threadMessage("아직 끝나지 않음");
					
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
	} // messageloop class end
	
	 public static void main(String[] args) throws InterruptedException {
		
		 long par = 10000* 60 * 60;
		 
		 if( args.length > 0 ) {
			 try {
				par = Long.parseLong(args[0])*1000;
			} catch (Exception e) {
				System.out.println("argument integer input ");
				System.exit(0);
				// TODO: handle exception
			}
		 }// if end
		 threadMessage("Start MessageLoop thread test");
		 long startTime = System.currentTimeMillis();
		 Thread t = new Thread(new MessageLoop());
		 t.start();
		 
		 while(t.isAlive()) {
			 threadMessage("still waitting.............");
			 t.join(1000);
			 
			 if(((System.currentTimeMillis()-startTime)>par)&& t.isAlive()){
				 threadMessage("Tired of watting..........");
				 
				 t.interrupt();
				 t.join();
			 }//if end
		 }//while end
		 threadMessage("end");
		 
	}
}

package ex05.syncronized;

class Atm {
	private int money;
	public Atm(int money) {
		this.money=money;
	}
	
	//입금함수 
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " : 입금금액  "+amount);
	}
	
	//출금 함수
	public void withdraw(int amount, String name) {
		
		synchronized (this ) {
		if((money - amount)> 0) {
			Thread.yield();//양보메소드
			money -=amount;
			System.out.println(name + " : 출금금액 "+ amount);
		}else {
			System.out.println(name + " : 잔액부족");
		}
		}//end synchronized 
	}
	
	//통장잔고 함수
	public void getMoney() {
		System.out.println("          잔액은  : " + money);
	}
	
	
}//Atm end

class UserAtm extends Thread{
	Atm obj;
	boolean flag = false;
	
	public UserAtm(Atm obj, String name) {
		super(name);
		this.obj=obj;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<2; i++) {
		try {
			sleep(50);
		}catch(Exception e) {
			e.printStackTrace();
		}
			if( flag ) {
				obj.deposit((int)(Math.random() * 10 + 2)*100, getName());
				obj.getMoney();
			}else {
				obj.withdraw((int)(Math.random() * 10 + 2)*100, getName());
				obj.getMoney();
			}//if end
			flag = true;
			
		}//for end
		
	}
	
	
	
} // UserAtm end


public class MainEntry {

	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at,"Park");
		UserAtm user2 = new UserAtm(at,"Jeon");
		UserAtm user3 = new UserAtm(at,"No");
		
		user1.start();
		user2.start();
		user3.start();
	}
}

package ex02.Interface;

public class Bus implements Transport {

	private double speed = 0;
	
	@Override
	public void move() {
		while ( speed < 5 ) {
			speed +=(acc *5);
			System.out.println("acc"+ speed);
	
		try {
			Thread.sleep(500); // 1000= 1ÃÊ
		}catch ( Exception e ) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		}
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Emergency Stop......");

	}

}

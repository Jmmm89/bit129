package ex03.Enum;


enum UserStatus {
	PENDING,
	ACTIVE,
	INACTIVE,
	DELETE ;
}

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println(UserStatus.ACTIVE);
	System.out.println("========================");
	
	for(UserStatus status : UserStatus.values());
//	  System.out.println(status);
	}
	
}

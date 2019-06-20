package ex06.string;

public class StringMAin {

	
	
	 public static void main(String[] args) {
		int x = 3, y = 5;
		System.out.println("x = " + x + ", y = " +y);
		x=y;
		System.out.println("x = " + x + ", y = " +y);
		
		String str1 = "korea";
		String str2 = "happy";
		System.out.println("Str 1 = " + str1 + " Str 2 = " + str2);
		System.out.println("hashcode : " + str1.hashCode() + "\t, " + str2.hashCode());
		
		str1= str2;
		System.out.println("Str 1 = " + str1 + " Str 2 = " + str2);
		System.out.println("hashcode : " + str1.hashCode() + "\t, " + str2.hashCode());
		
		str2 = "seoul";
		System.out.println("Str 1 = " + str1 + " Str 2 = " + str2);
		System.out.println("hashcode : " + str1.hashCode() + "\t, " + str2.hashCode());
		
		str2 = "JJM";
		System.out.println("Str 1 = " + str1 + " Str 2 = " + str2);
		System.out.println("hashcode : " + str1.hashCode() + "\t, " + str2.hashCode());
		
		String str3 = "JJM";
		System.out.println("Str 1 = " + str1 + " Str 2 = " + str2+ " Str 3 = " + str3);
		System.out.println("hashcode : " + str1.hashCode() + "\t, " + str2.hashCode()+ "\t, " + str3.hashCode());
		
		str3 = "KBS";
		System.out.println("Str 1 = " + str1 + " Str 2 = " + str2+ " Str 3 = " + str3);
		System.out.println("hashcode : " + str1.hashCode() + "\t, " + str2.hashCode()+ "\t, " + str3.hashCode());
		
		
		
	}
}

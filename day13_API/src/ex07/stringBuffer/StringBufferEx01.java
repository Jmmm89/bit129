package ex07.stringBuffer;

public class StringBufferEx01 {

	 public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();   //  디폴트 값은 16자리 이고 추가로 입력하면 입력한만큼 늘어남
		
		System.out.println("length  /  capacity");
		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len + "     /    " + size);
		
		sb.append("bitCamp");
		len = sb.length();  		size = sb.capacity();
		System.out.println(len + "        /            " + size);
		
		sb.append("bitCamp120939102382930138102983109"); 
		len = sb.length();  		size = sb.capacity();
		System.out.println(len + "        /            " + size);
		
		sb.trimToSize();
		len = sb.length();  		size = sb.capacity();
		System.out.println(len + "        /            " + size);

	}
}

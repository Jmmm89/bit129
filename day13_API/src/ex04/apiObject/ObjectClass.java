package ex04.apiObject;

class Point{
	
	
}





public class ObjectClass {

	public static void main(String[] args) {
	
		 Point pt = new Point();
		 System.out.println("Point pt information");
		 System.out.println("class name  : " + pt.getClass());
		 System.out.println("hashCode  : " + pt.hashCode());
		 System.out.println("Object String  : " + pt.toString());
		 System.out.println("Object String : " + pt);
		 System.out.println("====================================");
		 
//		 System.out.printf("10진수 %d\n", 15db9742);
		 
		 Point pt2 = new Point();
		 System.out.println("Point pt information");
		 System.out.println("class name  : " + pt.getClass());
		 System.out.println("hashCode  : " + pt.hashCode());
		 System.out.println("Object String  : " + pt.toString());
		 System.out.println("Object String : " + pt);
		 System.out.println("#####################################");
		 
		 
		 System.out.println("pt2.toString() :  toString()의 의미");
		 System.out.println(pt2.getClass().getName()+ Integer.toHexString(pt2.hashCode()));
		 
		 
		 Point pt3 = new Point ();
		 if ( pt.hashCode() == pt3.hashCode()) {
			 System.out.println("같다");
		 }else {
			 System.out.println("다르다");
		 }
			 
		 Point pt4;
		 pt4 = pt;
		 
		 if ( pt.hashCode() == pt4.hashCode()) {
			 System.out.println("같다");
		 }else {
			 System.out.println("다르다");
		 
		 
	}
	
	
	
}
}

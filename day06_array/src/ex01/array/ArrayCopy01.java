package ex01.array;

public class ArrayCopy01 {
public static void main(String[] args) {
	
  String[] arr = { "����" , "������" , "������" };
  String[] arr2 = new String[arr.length + 1];
  System.arraycopy(arr, 0, arr2, 0, arr.length);
  arr2[3] = "�ܿ��";
  System.out.println( arr + " : " + arr.length );
  arr = arr2;
  System.out.println( arr + " : " + arr.length );
  
  for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
}
}

package ex04.collection.list;

import java.util.*;

public class VectorEx01 {

	 public static void main(String[] args) {
		Vector<Integer> v =  new Vector();
		System.out.println("length           /          capacity");
		int len = v.size();
		System.out.println(len + "            /               "+v.capacity());
		
		Vector<Integer> v2 = new Vector(3,4); //  초기용량, 증가용량
		v2.add(2);
		v2.add(new Integer(333));
		v2.add(2);
		v2.add(3);
		v2.add(4);
		v2.add(5);
		v2.add(6);
		v2.add(7);
		
		
		
		len = v2.size();
		System.out.println(len + "            /               "+v.capacity());
		
		System.out.println("--------------- iterator () method ---------------------");
		Iterator it = v2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("--------- get method ------------");
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		
		System.out.println("----------sort result-------------");
		Collections.sort(v2);
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		System.out.println("------------ elementsAt() method -------------");
		for (int i = 0; i < v2.size(); i++) { // 벡터에 있는 모든 요소에 대해 반복
			Integer num = v2.elementAt(i); // 요소 객체 알아내기
			System.out.println(num.toString());
		}
		
		System.out.println("----------trimToSize() method -----------------------");
		v2.trimToSize(); //남는용량 정리
		System.out.println(v2.size() + "          /           " + v2.capacity());
	}
	 
	
	 
	 
	 
	 
}

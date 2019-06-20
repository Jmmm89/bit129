package ex03.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx01 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("bit", "129");
		map.put("kbs", 12345);
		map.put("kosta", "147");
		map.put("bitCamp", "129");
		
		System.out.println("요소 개수 : "  + map.size()); //키값은 중복x 밸류값은 허용
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("id 와 password를 입력해주세요. ");
			System.out.println("id : ");
			String id = scan.nextLine().trim();
			System.out.println("password : ");
			String pwd = scan.nextLine().trim();//trim으로 공백제거
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}else {
				if( !map.get(id).equals(pwd)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				}else {
					System.out.println("id와 pwd가 일치합니다.");
					break;
				}
			}
			
		} //end while
		
	}
}

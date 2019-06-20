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
		
		System.out.println("��� ���� : "  + map.size()); //Ű���� �ߺ�x ������� ���
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("id �� password�� �Է����ּ���. ");
			System.out.println("id : ");
			String id = scan.nextLine().trim();
			System.out.println("password : ");
			String pwd = scan.nextLine().trim();//trim���� ��������
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}else {
				if( !map.get(id).equals(pwd)) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				}else {
					System.out.println("id�� pwd�� ��ġ�մϴ�.");
					break;
				}
			}
			
		} //end while
		
	}
}

package ex02.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class List {
	 public static void main(String[] args) 
	    { 
	          Scanner input = new Scanner(System.in); 
	          ArrayList<String> list = new ArrayList<String>(); 
	          while (true) 
	          { 
	                System.out.println("1.�ܾ� �Է� 2.�ܾ� �˻� 3.����"); 
	                switch (input.nextInt()) 
	                { 
	                      case 1: 
	                          String eword; 
	                          String hword; 
	                          String word; 
	                          System.out.print("����ܾ� �Է�:"); 
	                          eword = input.next(); 
	                          System.out.print("�� �Է�:"); 
	                          hword = input.next(); 
	                          word = eword + "/" + hword;//1)�ܾ�� �ܾ��� ���� �Է¹޾� �ܾ����� �����϶�.(�����ڴ�'/'�� �����) 
	                          list.add(word); 
	                          list.sort(new Comparator()//2)�ܾ ���ĺ� ������ �����Ͽ� ������ �����. 
	                          { 
	                                @Override 
	                                public int compare(Object o1, Object o2) 
	                                { 
	                                      return ((String) o1).compareTo((String) o2); 
	                               } 
	                        }); 
	                        break; 
	                    case 2: 
	                        System.out.print("�˻� ����ܾ� �Է�:"); 
	                        eword = input.next(); 
	                        for (String s : list) 
	                        { 
	                              String[] tokens = s.split("/"); 
	                              if (tokens[0].equals(eword))//3)������ �����Ǿ����� �ܾ �Է��ϸ� �ܾ��� ���� �˷��ִ� ���α׷��� �ۼ�����. 
	                              { 
	                                    System.out.println(tokens[0] + ":" + tokens[1]); 
	                                    break; 
	                             } 
	                      } 
	                      break; 
	                  case 3:                    
	                      System.exit(0); 
	           } 
	      } 
	  } 
}

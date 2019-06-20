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
	                System.out.println("1.단어 입력 2.단어 검색 3.종료"); 
	                switch (input.nextInt()) 
	                { 
	                      case 1: 
	                          String eword; 
	                          String hword; 
	                          String word; 
	                          System.out.print("영어단어 입력:"); 
	                          eword = input.next(); 
	                          System.out.print("뜻 입력:"); 
	                          hword = input.next(); 
	                          word = eword + "/" + hword;//1)단어와 단어의 뜻을 입력받아 단어장을 구성하라.(구분자는'/'를 사용함) 
	                          list.add(word); 
	                          list.sort(new Comparator()//2)단어를 알파벳 순으로 정렬하여 사전을 만들라. 
	                          { 
	                                @Override 
	                                public int compare(Object o1, Object o2) 
	                                { 
	                                      return ((String) o1).compareTo((String) o2); 
	                               } 
	                        }); 
	                        break; 
	                    case 2: 
	                        System.out.print("검색 영어단어 입력:"); 
	                        eword = input.next(); 
	                        for (String s : list) 
	                        { 
	                              String[] tokens = s.split("/"); 
	                              if (tokens[0].equals(eword))//3)사전이 구성되었으면 단어를 입력하면 단어의 뜻을 알려주는 프로그램을 작성하자. 
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

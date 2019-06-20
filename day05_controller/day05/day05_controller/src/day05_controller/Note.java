package day05.day05_controller.src.day05_controller;

public class Note {
   /*
    * for (초기식1;조건식2;증감식4){
    * 수행문1;3 
    * 수행문2;
    * }
    *  2 3 4 순환
    * 
    * 예 ) int a = 1;
    * 
    * for( a = 1; a<= 2; a++){
    * system.out.print ( a+ "\t");}
    * 
    * - 초기값/증감식은 2개 이상 기재 가능
    * - 초기값/증감식은 생략 가능
    *    단, 조건은 오직 1개여야함/ 조건을 생략하면 무한 루프
    *    
    * -------------------------------------
    * int a = 1, b;
    * for( a, b=1; a<= 2 ; a++ b+=2) { ~~~
    * ~~~~ sysout a+ "\t"
    * -----------------------------------
    * 											 무한루프
    * int a = 1;                             int a =  1;
    * for( ; a <=2 ; ) {                     for( ;  ;  ) {
    *  sysout a +\t								sysout ( a + "\t") ;
    *  										if (조건) break;
    *  a++;										}
    * }											stack이 overflow 될때까지
    * 
    */
}

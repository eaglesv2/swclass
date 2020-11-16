package collection;

import java.util.ArrayList;

/*	Array   vs   Collection

Array : 고정길이배열, 상대적으로 처리속도가 빠르다, one data type
	int[] aa= new int[100];

(예) 아래 내용을 기억하려면
이름    점수
홍길동 100
이도령 98
성춘향 100

String[] name 배열 100개
int[] score 배열 100개

==> 이렇게 잡아야 함 / 2차원 배열 안됨 (열마다 type이 다르기 때문)

-------------------------------------------------
Collection : 가변길이배열, 상대적으로 처리속도가 늦다, multi data type
										// 정수, 실수, 문자, 문자열 . . . .
Collection --> set --> HashSet, TreeSet
			   list --> ArrayList, Vector, LinkedList (배열하고 가장 비슷)
			   map --> HashTable, HashMap, TreeMap

//=================================================
	int   vs   Integer(클래스화) (wrapper)
  (stack)       (heap)
int는 null 사용 x, Integer는 가능
int는 연산 o, Integer는 unboxing 해야 산술연산 o
int aa = 30;
Integer bb = aa; //auto boxing / stack -> heap
int cc = bb; //auto unboxing / heap -> stack 
			 //이 작업을 해야 산술 연산이 가능해짐


sql의 null과 연동시 Integer와 연동

(참고) Integer.parseInt()  vs  Integer.valueOf()
	int값 변환, 연산 o           Integer반환, 연산x

*/

public class Collection1 {
	public static void main(String args[]) {
		ArrayList arr = new ArrayList();
		
		System.out.println(arr.size()); //0 //가변길이
										//길이 = size / length 아님!
		
		arr.add(new Integer(300)); //multi data
		arr.add(new Double(100.7));
		arr.add(new Character('A'));
		arr.add(new String("ondal"));
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}

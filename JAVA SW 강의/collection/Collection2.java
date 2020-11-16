package collection;

import java.util.ArrayList;

/*
   <generic>
     배열과 컬렉션의 장점을 따서 만들어보자
     가변길이배열 + one data type
     
     형식은(문자열만 들어갈 경우)
   ArrayList<String> arr3 = new ArrayList<String>();
   
     객체만 들어가게 할 경우
   ArrayList<SMarket> arr3 = new ArrayList<SMarket>();

*/


public class Collection2 {
	public static void main(String args[]) {
		//(Q1) 문자열만 들어가는 ArrayList 객체 arr1 생성하기
		
		         //generic
		ArrayList<String> arr1 = new ArrayList<String>();
		System.out.println(arr1.size()); //0
		
		//arr1.add(30);
		arr1.add("빵");
		arr1.add("라면");
		arr1.add("우유");
		arr1.add("김밥");
		
		//내용 수정은 set, 삭제는 remove
		
		arr1.set(1, "과자"); //라면-->과자
		arr1.remove(2); //3번째 문자열 우유 삭제
		arr1.remove("빵"); //빵 삭제
		
		//결국 있는것은 과자 김밥
		// ArrayList는 입력은 add() 출력은 get(i)
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		
		for(String imsi:arr1) {
			System.out.println(imsi);
		}
	}
}

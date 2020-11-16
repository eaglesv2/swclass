package collection;

import java.util.ArrayList;

/*(Q4) 이제 여기에 generic을 적용시켜보자는~~~
	  ArrayList<SMarket> arr5를 만들어 5개정도 판매상품을 넣은 후
	  toString 사용없이 가격이 2000원 미만인 상품의 이름만 모두 출력하시오
		 */

public class Collection5 {
	public static void main(String args[]) {
		ArrayList<SMarket> arr5 = new ArrayList<SMarket>();
		
		arr5.add(new SMarket("우유",1000));
		arr5.add(new SMarket("빵",2000));
		arr5.add(new SMarket("라면",1500));
		arr5.add(new SMarket("콜라",1800));
		arr5.add(new SMarket("김밥",2500));
		
		for(int i=0; i<arr5.size(); i++) {
			if(arr5.get(i).getPrice() < 2000) 				 	//생성자로 초기값을 줬지만
				System.out.println(arr5.get(i).getSangpum());   //하나씩 꺼내오기 위해선 getter 필요
		}
	}
}

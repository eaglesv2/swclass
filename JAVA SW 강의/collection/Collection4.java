package collection;

import java.util.ArrayList;
import java.util.Date;

public class Collection4 {
	public static void main(String args[]) {
		
		/*(Q3) 이제 여기에 Collection을 적용시켜보자는~~~
		ArrayList arr3를 만들어 처음에 판매한 날짜를 넣고
		그 다음부터 판매 내용을 넣은 후 모두 출력하시오
		
		(출력에)
		Mon Nov 16 19:59:44 KST 2020
		상품이름은 우유이고 상품가격은 1000원 입니다.
		상품이름은 빵이고 상품가격은 2000원 입니다.
*/
		ArrayList arr3 = new ArrayList();
		arr3.add(new Date());
		
		
		/*객체(사용자 정의 객체 등)를 넣으려면
		객체부터 만든다 SMarket s1 = new SMarket("우유",2500);
		컬렉션에 넣으려면 new SMarket("우유",2500); 를 만들고
		add로 넣는다 
		객체를 컬렉션 배열에 넣어서 관리한다
		객체명을 따로 선언하지 않는다
		*/
		
		arr3.add(new SMarket("우유",1000));
		arr3.add(new SMarket("빵",2000));
		
		for(int i=0; i<arr3.size(); i++) {
			System.out.println(arr3.get(i));
		}
	}
}

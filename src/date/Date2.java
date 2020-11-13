package date;

import java.util.*;

//Q) 살아온 날짜 수 계산하기

  //

public class Date2 {
	public static void main(String args[]) {
		/*Date d1 = new Date(1000L);
		System.out.println(d1);
		System.out.println(d1.toLocaleString());
		System.out.println(d1.toGMTString());*/
		
		Date mybday = new Date(1994-1900,10-1,14);
		Date today = new Date();
		long days = (today.getTime()-mybday.getTime())/1000/3600/24; //miliseconds -> seconds -> hours -> days
		System.out.println("태어난지 " + days + "일"); 
		//현재 시간은 계속 변화중
		//생일은 00시 00분 00초로 고정해놨기 때문에 오차 발생할 수도 있음
	}
}

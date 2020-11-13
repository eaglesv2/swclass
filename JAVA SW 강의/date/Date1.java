package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*클래스
1) 사용자 정의 클래스(user defined class)
   설계(정의) - 제작(new, 생성) - 사용 의 3단계
2) 내장 클래스
  Scanner, System, Date
*/

public class Date1 {
	public static void main(String args[]) {
		//import 선택시
		//java.sql.Date, java.util.Date
		//(참고) System 클래스 : java.lang 인데 안씀
		//import 패키지명.클래스명
		//(예) import java.util.Date;
		
		Date d1 = new Date();
		//자바 스크립트
		//window.location = "http://www.naver.com"
		//객체.속성=값
		
		System.out.println(d1); //you remember!!!!!!
								//toString() 오버라이딩!!!
		
		System.out.println(d1.toLocaleString());
		
		
		
		
		//Q) 출력은 오늘은 0년 0월이며 0일이고 0요일이다
		String[] yoil = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("오늘은 " + (d1.getYear()+1900) + "년 " + (d1.getMonth()+1) +"월이며 " 
							+ d1.getDate() +"일이고 " + yoil[d1.getDay()] + "요일이다");
		//year 1900년 기준 , +1900 해야함
		//month 0~11 출력, +1 해야함
		//day 일~토를 0~6으로 표현, 매칭시켜줘야함
		
		
		//Q) 오늘보터 만난지 100일 되는날 출력하기
		Date d2 = new Date();
		d2.setDate(d2.getDate() +100 -1); // 만난지 100일
		System.out.println(d2.toLocaleString());
		
		Calendar cal = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		cal.add(Calendar.DATE, 100-1);
		System.out.println("오늘부터 100일 : " + df.format(cal.getTime()));
	}
}

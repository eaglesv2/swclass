package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date3 {
	public static void main(String args[]) {
		Date d3 = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println(sdf1.format(d3));
		
		
		//------자바 날짜 to sql 날짜 (import 선언은 java.util만 한다)
		Date d11 = new Date(); // 자바 - 날짜
		java.sql.Date s11 = new java.sql.Date(d11.getTime());
		System.out.println(d11);
		System.out.println(s11);
	}
}

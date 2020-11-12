package mybang2;

import java.util.*;

public class LeapYear {
	public static void main(String args[]) {
		/*365.2442일 = 365일 6시간 9분
	    0.2422*4=0.9688 = 약 1일
	    4년마다 2월 29일 = 윤년
	    100년에 한번씩은 평년으로
	    400년에 한번씩은 윤년*/

		Scanner sc = new Scanner(System.in);
		System.out.println("i년은 윤년입니까?");
		System.out.print("i = ");
		int i = sc.nextInt();
		
		if(i%4==0 && i%100!=0 ||i%400==0) 
			System.out.println("윤년입니다");
		else
			System.out.println("평년입니다");
	}
}

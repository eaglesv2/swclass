package method;

import java.util.Scanner;

public class Method_2nd {
	public static void main(String args[]) {
		/*Q) 메소드 2형식을 사용하여 윤년인지 알아내시오
		    이 때 윤년 알아내기하는 비서에게 교통비 10000원도 전달하시오
		    단, 이때 인자는 2개 사용함, 년도 입력은 main에서 함*/
		
		  /* 출력형식은 다음처럼
		   
		   차비 10000원 받았음
		   2020년은 윤년*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		int i = Integer.parseInt(sc.next());
		kajaYoon(i,10000); //메소드 호출문 - 2형식 //인자,인수,argument
	}

	private static void kajaYoon(int i, int chabi) { //매개변수,parameter
		System.out.println("차비 " + chabi + "원 받았음");
		
		if(i%4==0 && i%100!=0 || i%400==0) 
			System.out.println(i + "년은 윤년입니다");
		else
			System.out.println(i + "년은 평년입니다");
	}
}

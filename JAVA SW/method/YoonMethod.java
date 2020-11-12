package method;

import java.util.Scanner;

public class YoonMethod {
	public static void main(String args[]) {
		
		//Q)메소드 1형식을 사용하여 윤년인지 알아내시오 //1형식 : 메소드 갔다가 처리하고 돌아오는 것
		
		kajaYoon();
	}

	private static void kajaYoon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("i년은 윤년입니까?");
		System.out.print("i = ");
		int i = sc.nextInt();
		
		if(i%4==0 && i%100!=0 || i%400==0) 
			System.out.println(i + "년은 윤년입니다");
		else
			System.out.println(i + "년은 평년입니다");
		
	}
}

package mybang3;

import java.util.Scanner;

public class Switch2 {
	public static void main(String args[]) {
		//Q) 월을 입력받아 해당월의 날짜수를 출력하는 프로그램을 작성하시오
		//단, switch문과 break생략 기법 사용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 월 ~~?");
		int month = sc.nextInt();
		
		while(month<1 || month >12) {
			System.out.println("다시 입력해!");
			month = sc.nextInt();
		}
		
		//31일 1,3,5,7,8,10,12
		//30일 4,6,9,11
		//28일 2
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 :
		case 8 : case 10 : case 12 :
			System.out.println("31일까지~");
			break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println("30일까지~");
			break;
		default :
			System.out.println("28일까지~");
			
		}
	}
}

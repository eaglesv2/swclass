package method;

import java.util.Scanner;

public class MethodPrac {
	public static void main(String args[]) {
		choki(); //메소드 호출문
		choongyo();
		chool();
	}//main-end

	private static void chool() {
		System.out.println("결과출력");
	}

	private static void choongyo() {
		System.out.println("3의 배수 구하기");
	}

	private static void choki() { //메소드 정의문
		System.out.println("초기치 자리는 여기라는~~~");
	}//choki() 정의문-end
}//class-end

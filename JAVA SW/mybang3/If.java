package mybang3;

import java.util.Scanner;

public class If {
	public static void main(String args[]) {
		/*i2값을 입력받아 i2가 3의 배수이면 "거봐".
		 *5의 배수이면 "아하", 3과 5의 동시 배수이면
		 *"동시배수배수~~~"를 출력하는 자바
		 *프로그램을 작성하시오
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 숫자 입력해봐 ");
		int i2 = sc.nextInt(); //키보드 입력
		//Integer.parseInt(sc.next()); 문자-->숫자 "30"->30
		//sc.nextInt() -> 여러번 입력 받을 경우에 문제 잘생할 수도 있음
		if(i2%3==0&&i2%5==0) 
			System.out.println("동시배수배수~~~");
		else if(i2%5==0) 
			System.out.println("아하");
		else if(i2%3==0) 
			System.out.println("거봐");
		else 
			System.out.println("둘다 아니야~");
	}
}

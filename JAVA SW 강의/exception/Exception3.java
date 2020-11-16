package exception;

import java.util.Scanner;

public class Exception3 {
	public static void main(String args[]) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수는 : ");
		String one = sc.nextLine();

		int soo1 = Integer.parseInt(one);
		
		System.out.print("두번째 수는 : ");
		String two = sc.nextLine();
		int soo2 = Integer.parseInt(two);
		System.out.println(soo1/soo2);
		}catch(NumberFormatException e ) {
			System.out.println("숫자로 입력하면 안되겠니!!");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어~");
		}catch(Exception e) {
			System.out.println("다른 예외 처리");
			System.out.println(e);
			System.out.println(e.getMessage());
		}finally {
			System.out.println("gooooooooooooood");
		}
	}
}

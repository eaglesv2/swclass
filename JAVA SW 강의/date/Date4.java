package date;

import java.util.Scanner;

public class Date4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수는 : ");
		String one = sc.nextLine();
		//빈칸포함 한 줄 다 입력 // i love you 한 줄 다 읽음
		//but next()는 i만 읽음
		
		int soo1 = Integer.parseInt(one);
		
		System.out.print("두번째 수는 : ");
		String two = sc.nextLine();
		int soo2 = Integer.parseInt(two);
		System.out.println(soo1/soo2);
		
		System.out.println("gooooooooooooooooooooood");
	}
}

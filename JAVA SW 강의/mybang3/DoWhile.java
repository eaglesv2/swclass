package mybang3;

import java.util.Scanner;

public class DoWhile {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String order;
		do {
			System.out.println("1.짜장");
			System.out.println("2.짬뽕");
			System.out.println("선택하세요(1-2)");
			order = sc.nextLine();
		}while(!order.equals("1") && !order.equals("2")); //값 비교
		      //order!="1" && order!="2" --> 번지 비교
		if(order.equals("1"))
			System.out.println("짜장 맛있게 드세요");
		if(order.equals("2"))
			System.out.println("짬뽕 맛있게 드세요");
	}
}
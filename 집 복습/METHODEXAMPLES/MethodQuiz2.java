package METHODEXAMPLES;

import java.util.Scanner;

public class MethodQuiz2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sumBetween(a,b);
		
	}

	private static void sumBetween(int a, int b) {
		int sum = 0;
		int x = a;
		for(int i = x; x<=b; x++) {
			sum += x;
		}
		
		System.out.println("첫 번째 수 : " + a);
		System.out.println("두 번째 수 : " + b);
		System.out.println(a + "~" + b + " 사이의 합 : " + sum);
	}
}

package ARRAYEXAMPLES;

import java.util.Scanner;

public class ArrayQuiz2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수를 입력 : ");
		int inwon = sc.nextInt();
		
		String name[] = new String[inwon];
		int age[] = new int[inwon];
	
		for(int i=0; i<inwon; i++) {
			System.out.println(i+1+"번째 사람 정보 입력");
			System.out.print("이름 : ");
			name[i] = sc.next();
			System.out.print("나이 : ");
			age[i] = sc.nextInt();
		}
		
		for(int i=0; i<inwon; i++) {
			System.out.println(i+1+".정보");
			System.out.println("이름 : " + name[i] + ", 나이 : " + age[i] );
		}
	}
}

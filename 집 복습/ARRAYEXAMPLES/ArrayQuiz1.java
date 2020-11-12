package ARRAYEXAMPLES;

import java.util.Scanner;

public class ArrayQuiz1 {
	public static void main(String args[]) {
		// Q) int[] st = new int[4] 배열을 만들어
		// 국어,영어,수학,총점,평균을 구하는 프로그램을 작성하세요.
		// 0~100 사이의 점수만 입력되도록 구현
		
		Scanner sc = new Scanner(System.in);
		int kor, math, eng;
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		if(kor<0||kor>100) {
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();
		}
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
		if(math<0||math>100) {
			System.out.print("수학 점수 : ");
			math = sc.nextInt();
		}
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		if(eng<0||eng>100) {
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();
		}
		System.out.println("총점 : " + (kor + math + eng));
		System.out.println("평균 : " + (kor + math + eng)/3.0);
	}
}

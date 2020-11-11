package mybang3;

import java.util.Scanner;

public class While2 {
	public static void main(String args[]) {
		int jum;
		int count = 0;
		int total = 0;
		int max;
		System.out.print("점수 : "); //two-read 중 one-read
		Scanner sc = new Scanner(System.in);
		jum = sc.nextInt();
		max = jum; //1st 점수를 무조건 max로
		
		while(jum != -1) { //eof 체크 
			count ++;
			total += jum;
			if(jum > max)
				max = jum;
			System.out.print("점수 : "); //two-read 중 two-read
			jum = sc.nextInt();
		}
		double average = (double)total/count;

		System.out.println("점수 최고점 : " + max);
		System.out.println("과목 수 : " + count);
		System.out.printf("점수 평균 : %.2f", average);
	}
}
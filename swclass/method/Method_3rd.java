package method;

import java.util.Scanner;

public class Method_3rd {
	public static void main(String args[]) {
		/*Q) 메소드 3형식을 사용하여 윤년인지 알아내시오
		     단, 년도 입력은 main()에서, 윤년 평년 계산은 정의문에서
		     윤년 평년의 출력은 main에서 하시오*/
		
		/*출력형식
		
		년도 입력 : 2020
		아하~~~2020년도는 윤년*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int i = sc.nextInt();
		
		String yoon = kajaYoon(i);
		
		System.out.println("아하~~~" + i + "년도는" + yoon);
		//System.out.println(kajaYoon(i))
	}
                   //반환형(return type)
	private static String kajaYoon(int i) {
		if(i%4==0 && i%100!=0 || i%400==0) 
			return "윤년";
		else
			return "평년";
	}
}

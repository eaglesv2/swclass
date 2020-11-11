package method;

import java.util.Scanner;

public class Method_3rd_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키랑 몸무게 얼마야?");
		System.out.print("키 = ");
		int h = sc.nextInt();
		System.out.print("몸무게 = ");
		int w = sc.nextInt();
		
		String result = bmiCalc(h,w);
		
		System.out.println(result);
	}

	private static String bmiCalc(int h, int w) {
		double mh = h/100.0;
		double bmi = w/(Math.pow(mh,2));
		String result;
		System.out.printf("BMI 수치는 %.2f\n", bmi);
		
		if(bmi>=30.0)
			result = "비만";
		else if(bmi>=25.0) 
			result = "과체중";
		else if(bmi>=20.0)
			result = "보통";
		else 
			result = "저체중";
		return result;
	}
}

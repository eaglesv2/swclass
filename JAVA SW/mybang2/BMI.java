package mybang2;
import java.util.*;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("키랑 몸무게 얼마야?");
		System.out.print("키 = ");
		int h = sc.nextInt();
		System.out.print("몸무게 = ");
		int w = sc.nextInt();
		double mh = h/100.0;
		double bmi = w/(Math.pow(mh,2));
		
		System.out.printf("너의 BMI 수치는 %.2f야~\n", bmi);
		if(bmi>=30.0)
			System.out.println("비만이야~ 건강 생각하자");
		else if(bmi>=25.0) 
			System.out.println("과체중이야~ 조금만 관리하자");
		else if(bmi>=20.0)
			System.out.println("보통이야~ 이대로 유지하자");
		else if(bmi>0.0)
			System.out.println("저체중이야~ 좀 먹고 다녀");
		else
			System.out.println("키 몸무게 잘못 입력한듯??");
		
		/*String result;
			if(bmi>=30.0)
				result = "비만";
			else if(bmi>=25.0) 
				result = "과체중";
			else if(bmi>=20.0)
				result = "보통";
			else 
				result = "저체중";
			
			System.out.println(result);
		 */
	}
}
